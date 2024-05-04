package streaming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: movie-stream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieStreamGrpc {

  private MovieStreamGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Streaming.MovieStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<streaming.MovieStreamOuterClass.GetMoviesRequest,
      streaming.MovieStreamOuterClass.GetMoviesReply> getGetMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovies",
      requestType = streaming.MovieStreamOuterClass.GetMoviesRequest.class,
      responseType = streaming.MovieStreamOuterClass.GetMoviesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<streaming.MovieStreamOuterClass.GetMoviesRequest,
      streaming.MovieStreamOuterClass.GetMoviesReply> getGetMoviesMethod() {
    io.grpc.MethodDescriptor<streaming.MovieStreamOuterClass.GetMoviesRequest, streaming.MovieStreamOuterClass.GetMoviesReply> getGetMoviesMethod;
    if ((getGetMoviesMethod = MovieStreamGrpc.getGetMoviesMethod) == null) {
      synchronized (MovieStreamGrpc.class) {
        if ((getGetMoviesMethod = MovieStreamGrpc.getGetMoviesMethod) == null) {
          MovieStreamGrpc.getGetMoviesMethod = getGetMoviesMethod =
              io.grpc.MethodDescriptor.<streaming.MovieStreamOuterClass.GetMoviesRequest, streaming.MovieStreamOuterClass.GetMoviesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.MovieStreamOuterClass.GetMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.MovieStreamOuterClass.GetMoviesReply.getDefaultInstance()))
              .setSchemaDescriptor(new MovieStreamMethodDescriptorSupplier("GetMovies"))
              .build();
        }
      }
    }
    return getGetMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<streaming.MovieStreamOuterClass.WatchRequest,
      streaming.MovieStreamOuterClass.WatchReply> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = streaming.MovieStreamOuterClass.WatchRequest.class,
      responseType = streaming.MovieStreamOuterClass.WatchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<streaming.MovieStreamOuterClass.WatchRequest,
      streaming.MovieStreamOuterClass.WatchReply> getWatchMethod() {
    io.grpc.MethodDescriptor<streaming.MovieStreamOuterClass.WatchRequest, streaming.MovieStreamOuterClass.WatchReply> getWatchMethod;
    if ((getWatchMethod = MovieStreamGrpc.getWatchMethod) == null) {
      synchronized (MovieStreamGrpc.class) {
        if ((getWatchMethod = MovieStreamGrpc.getWatchMethod) == null) {
          MovieStreamGrpc.getWatchMethod = getWatchMethod =
              io.grpc.MethodDescriptor.<streaming.MovieStreamOuterClass.WatchRequest, streaming.MovieStreamOuterClass.WatchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.MovieStreamOuterClass.WatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.MovieStreamOuterClass.WatchReply.getDefaultInstance()))
              .setSchemaDescriptor(new MovieStreamMethodDescriptorSupplier("Watch"))
              .build();
        }
      }
    }
    return getWatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieStreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieStreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieStreamStub>() {
        @java.lang.Override
        public MovieStreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieStreamStub(channel, callOptions);
        }
      };
    return MovieStreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieStreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieStreamBlockingStub>() {
        @java.lang.Override
        public MovieStreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieStreamBlockingStub(channel, callOptions);
        }
      };
    return MovieStreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieStreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieStreamFutureStub>() {
        @java.lang.Override
        public MovieStreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieStreamFutureStub(channel, callOptions);
        }
      };
    return MovieStreamFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getMovies(streaming.MovieStreamOuterClass.GetMoviesRequest request,
        io.grpc.stub.StreamObserver<streaming.MovieStreamOuterClass.GetMoviesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
    }

    /**
     */
    default void watch(streaming.MovieStreamOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<streaming.MovieStreamOuterClass.WatchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovieStream.
   */
  public static abstract class MovieStreamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovieStreamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovieStream.
   */
  public static final class MovieStreamStub
      extends io.grpc.stub.AbstractAsyncStub<MovieStreamStub> {
    private MovieStreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieStreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieStreamStub(channel, callOptions);
    }

    /**
     */
    public void getMovies(streaming.MovieStreamOuterClass.GetMoviesRequest request,
        io.grpc.stub.StreamObserver<streaming.MovieStreamOuterClass.GetMoviesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watch(streaming.MovieStreamOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<streaming.MovieStreamOuterClass.WatchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovieStream.
   */
  public static final class MovieStreamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovieStreamBlockingStub> {
    private MovieStreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieStreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieStreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public streaming.MovieStreamOuterClass.GetMoviesReply getMovies(streaming.MovieStreamOuterClass.GetMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<streaming.MovieStreamOuterClass.WatchReply> watch(
        streaming.MovieStreamOuterClass.WatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovieStream.
   */
  public static final class MovieStreamFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovieStreamFutureStub> {
    private MovieStreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieStreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieStreamFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<streaming.MovieStreamOuterClass.GetMoviesReply> getMovies(
        streaming.MovieStreamOuterClass.GetMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOVIES = 0;
  private static final int METHODID_WATCH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOVIES:
          serviceImpl.getMovies((streaming.MovieStreamOuterClass.GetMoviesRequest) request,
              (io.grpc.stub.StreamObserver<streaming.MovieStreamOuterClass.GetMoviesReply>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((streaming.MovieStreamOuterClass.WatchRequest) request,
              (io.grpc.stub.StreamObserver<streaming.MovieStreamOuterClass.WatchReply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              streaming.MovieStreamOuterClass.GetMoviesRequest,
              streaming.MovieStreamOuterClass.GetMoviesReply>(
                service, METHODID_GET_MOVIES)))
        .addMethod(
          getWatchMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              streaming.MovieStreamOuterClass.WatchRequest,
              streaming.MovieStreamOuterClass.WatchReply>(
                service, METHODID_WATCH)))
        .build();
  }

  private static abstract class MovieStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieStreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return streaming.MovieStreamOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieStream");
    }
  }

  private static final class MovieStreamFileDescriptorSupplier
      extends MovieStreamBaseDescriptorSupplier {
    MovieStreamFileDescriptorSupplier() {}
  }

  private static final class MovieStreamMethodDescriptorSupplier
      extends MovieStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MovieStreamMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MovieStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieStreamFileDescriptorSupplier())
              .addMethod(getGetMoviesMethod())
              .addMethod(getWatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
