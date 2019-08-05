package com.neo.service;

import io.grpc.geotools.GeoToolsGrpc;
import io.grpc.geotools.InPolygonReply;
import io.grpc.geotools.InPolygonRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.geotools.geometry.jts.JTSFactoryFinder;
import org.locationtech.jts.algorithm.PointLocator;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;

import java.util.List;

@GrpcService
public class GeoService extends GeoToolsGrpc.GeoToolsImplBase {
    @Override
    public void inPolygon(InPolygonRequest request, StreamObserver<InPolygonReply> responseObserver) {
        List<InPolygonRequest.Point> polygonList = request.getPolygonList();
        int pointNum = polygonList.size();
        if (pointNum < 3) {
            InPolygonReply reply = InPolygonReply.newBuilder().setCode(1).setMsg("polygon error").setResult(false).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        Coordinate[] polygon = new Coordinate[polygonList.size()];
        for (int i=0; i<polygonList.size(); i++) {
            polygon[i] = new Coordinate(polygonList.get(i).getLat(), polygonList.get(i).getLng());
        }

        GeometryFactory gf = JTSFactoryFinder.getGeometryFactory(null);
        Geometry g1 = gf.createPolygon(polygon);

        // 建立缓冲区
        Geometry buffer = g1.buffer(5);

        // 点是否在多边形内
        Coordinate targetPoint = new Coordinate(request.getPoint().getLat(), request.getPoint().getLng());
        PointLocator pl = new PointLocator();
        boolean inScope = pl.intersects(targetPoint, g1);

        InPolygonReply reply = InPolygonReply.newBuilder().setCode(0).setMsg("ok").setResult(inScope).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
