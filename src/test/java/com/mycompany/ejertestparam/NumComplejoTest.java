package com.mycompany.ejertestparam;

import static org.junit.Assert.*;

import org.junit.Test;


import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class NumComplejoTest {

	@Parameterized.Parameters
	public static List<Object> datos(){
		List<Object> asList = Arrays.asList(new Object [][] {{1,3,4,2},
															{3,5,5,6},
															{5,2,7,2},
															{8,2,1,2},
															{7,4,4,8},
															{5,7,7,2},
															{7,7,9,1},
															{8,9,6,3},
															{3,3,3,0},
															{3,7,1,8}});
		return asList;
		
	} 
	@Parameterized.Parameter(0)
	public int v1;
	@Parameterized.Parameter(1)
	public int v2;
	@Parameterized.Parameter(2)
	public int v3;
	@Parameterized.Parameter(3)
	public int v4;
	

	@Test
	public void testSuma() {
		
		NumComplejo numero1 = new NumComplejo(v1, v2);
		NumComplejo numero2 = new NumComplejo(v3, v4);
		NumComplejo resultado =	numero1.sumar(numero2);
		int numeroReal=v1+v3;
		int numeroImaginario =v2+v4;
		NumComplejo esperadoComplejo = new NumComplejo(numeroReal, numeroImaginario);
		

		assertEquals(esperadoComplejo, resultado);
	}
	@Test
	public void testResta() {
		
		NumComplejo numero1 = new NumComplejo(v1, v2);
		NumComplejo numero2 = new NumComplejo(v3, v4);
		NumComplejo resultado =	numero1.restar(numero2);
		int numeroReal=v1+v3;
		int numeroImaginario =v2+v4;
		NumComplejo esperadoComplejo = new NumComplejo(numeroReal, numeroImaginario);
		
		
		assertEquals(esperadoComplejo, resultado);
	}

}
