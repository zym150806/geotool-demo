// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geoservice.proto

package io.grpc.geoservice;

public final class GeoServiceProto {
  private GeoServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_geoservice_InPolygonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_geoservice_InPolygonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_geoservice_InPolygonRequest_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_geoservice_InPolygonRequest_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_geoservice_InPolygonReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_geoservice_InPolygonReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020geoservice.proto\022\ngeoservice\"\235\001\n\020InPol" +
      "ygonRequest\0221\n\005point\030\001 \001(\0132\".geoservice." +
      "InPolygonRequest.Point\0223\n\007polygon\030\002 \003(\0132" +
      "\".geoservice.InPolygonRequest.Point\032!\n\005P" +
      "oint\022\013\n\003lat\030\001 \001(\002\022\013\n\003lng\030\002 \001(\002\" \n\016InPoly" +
      "gonReply\022\016\n\006result\030\001 \001(\0102U\n\nGeoService\022G" +
      "\n\tInPolygon\022\034.geoservice.InPolygonReques" +
      "t\032\032.geoservice.InPolygonReply\"\000B-\n\022io.gr" +
      "pc.geoserviceB\017GeoServiceProtoP\001\242\002\003GSPb\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_geoservice_InPolygonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_geoservice_InPolygonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_geoservice_InPolygonRequest_descriptor,
        new java.lang.String[] { "Point", "Polygon", });
    internal_static_geoservice_InPolygonRequest_Point_descriptor =
      internal_static_geoservice_InPolygonRequest_descriptor.getNestedTypes().get(0);
    internal_static_geoservice_InPolygonRequest_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_geoservice_InPolygonRequest_Point_descriptor,
        new java.lang.String[] { "Lat", "Lng", });
    internal_static_geoservice_InPolygonReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_geoservice_InPolygonReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_geoservice_InPolygonReply_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
