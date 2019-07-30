package com.neo.service;

import io.grpc.geoservice.GeoGrpc;
import io.grpc.geoservice.InPolygonReply;
import io.grpc.geoservice.InPolygonRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class GeoService extends GeoGrpc.GeoImplBase {
    @Override
    public void inPolygon(InPolygonRequest request, StreamObserver<InPolygonReply> responseObserver) {
        List<InPolygonRequest.Point> polygonList = request.getPolygonList();
        for (int i=0; i<polygonList.size(); i++) {
            InPolygonRequest.Point polygon = polygonList.get(i);
            polygon.getLat();
        }

    }

}
