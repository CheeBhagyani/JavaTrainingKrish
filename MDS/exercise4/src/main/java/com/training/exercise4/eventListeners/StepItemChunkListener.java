package com.training.exercise4.eventListeners;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class StepItemChunkListener implements ChunkListener{

	@Override
	public void beforeChunk(ChunkContext context) {
		System.out.println("ChunkListener - beforeChunk");
		
	}

	@Override
	public void afterChunk(ChunkContext context) {
		System.out.println("ChunkListener - afterChunk");
		
	}

	@Override
	public void afterChunkError(ChunkContext context) {
		System.out.println("ChunkListener - afterChunkError");
		
	}

}
