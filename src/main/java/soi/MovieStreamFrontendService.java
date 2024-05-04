package soi;

import streaming.MovieStreamOuterClass.GetMoviesRequest;
import streaming.MovieStreamOuterClass.MovieInfo;
import streaming.SingleMovieGrpc.SingleMovieBlockingStub;
import streaming.SingleMovieOuterClass.GetTitleReply;
import streaming.SingleMovieOuterClass.GetTitleRequest;
import streaming.MovieStreamOuterClass.GetMoviesReply;
import streaming.MovieStreamGrpc;
import streaming.MovieStreamGrpc.MovieStreamBlockingStub;

import java.util.ArrayList;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MovieStreamFrontendService extends MovieStreamGrpc.MovieStreamImplBase {

	@GrpcClient("MoviePi_CAX1RR")
	private SingleMovieBlockingStub pibackend;
	
	@GrpcClient("MovieE_CAX1RR")
	private SingleMovieBlockingStub ebackend;
	
	@Override
	public void getMovies(GetMoviesRequest request, StreamObserver<GetMoviesReply> responseObserver) {
		ArrayList<MovieInfo> lista = new ArrayList<>();
		
		var replyFromBackend = pibackend.getTitle(null);
		var title = replyFromBackend.getTitle();
		lista.add(replyFromBackend);
		var reply = GetMoviesReply.newBuilder().addAllMovies(lista).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
}
