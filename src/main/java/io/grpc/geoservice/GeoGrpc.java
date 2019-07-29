package io.grpc.geoservice;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: geoservice.proto")
public class GeoGrpc {

  private GeoGrpc() {}

  public static final String SERVICE_NAME = "geoservice.Geo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.geoservice.InPolygonRequest,
      io.grpc.geoservice.InPolygonReply> METHOD_IN_POLYGON =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "geoservice.Geo", "InPolygon"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.geoservice.InPolygonRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.geoservice.InPolygonReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeoStub newStub(io.grpc.Channel channel) {
    return new GeoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GeoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GeoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GeoFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GeoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void inPolygon(io.grpc.geoservice.InPolygonRequest request,
        io.grpc.stub.StreamObserver<io.grpc.geoservice.InPolygonReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IN_POLYGON, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_IN_POLYGON,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.geoservice.InPolygonRequest,
                io.grpc.geoservice.InPolygonReply>(
                  this, METHODID_IN_POLYGON)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GeoStub extends io.grpc.stub.AbstractStub<GeoStub> {
    private GeoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeoStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void inPolygon(io.grpc.geoservice.InPolygonRequest request,
        io.grpc.stub.StreamObserver<io.grpc.geoservice.InPolygonReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IN_POLYGON, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GeoBlockingStub extends io.grpc.stub.AbstractStub<GeoBlockingStub> {
    private GeoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.geoservice.InPolygonReply inPolygon(io.grpc.geoservice.InPolygonRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IN_POLYGON, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GeoFutureStub extends io.grpc.stub.AbstractStub<GeoFutureStub> {
    private GeoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.geoservice.InPolygonReply> inPolygon(
        io.grpc.geoservice.InPolygonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IN_POLYGON, getCallOptions()), request);
    }
  }

  private static final int METHODID_IN_POLYGON = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GeoImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GeoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IN_POLYGON:
          serviceImpl.inPolygon((io.grpc.geoservice.InPolygonRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.geoservice.InPolygonReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_IN_POLYGON);
  }

}
