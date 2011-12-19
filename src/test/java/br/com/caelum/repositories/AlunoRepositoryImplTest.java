package br.com.caelum.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AlunoRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new AlunoRepositoryImpl(null));
  	}
}

