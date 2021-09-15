package com.bridgelabs.indiastatecensus;

import org.junit.Test;



public class IndianStateCensusTest {
	private static final String path = "F:\\PRITESH\\state.csv";
	public IndianCensusAnalyser analyser;
	
	@Test
	public void returnSize() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			org.junit.Assert.assertEquals(29, analyser.loadCensusData(path));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldExecuteProperly_IfRecordsAreEqual() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			org.junit.Assert.assertEquals(29, analyser.loadCensusData(path));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnRecordsif_CSVFileIsDetected() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			org.junit.Assert.assertEquals(29, analyser.loadCensusData(path));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnCustomException_ifDelimiterIncorrect() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			org.junit.Assert.assertEquals(29, analyser.loadCensusData(path));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturCustomException_ifCSVHeaderIncorrect() throws Exception {
		try {
			analyser = new IndianCensusAnalyser();
			org.junit.Assert.assertEquals(29, analyser.loadCensusData(path));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}