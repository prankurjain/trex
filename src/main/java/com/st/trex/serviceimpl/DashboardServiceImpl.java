package com.st.trex.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.st.trex.dto.DashboardData;
import com.st.trex.dto.SeriesData;
import com.st.trex.service.IDashboardService;

@Service
public class DashboardServiceImpl implements IDashboardService{

	@Override
	public List<DashboardData> getDashBoardData() {
		
		List<DashboardData> list = new ArrayList<>();
		// TODO Auto-generated method stub
		DashboardData ww1 = new DashboardData();
		ww1.setName("WW1");

		SeriesData passed = new SeriesData();
		passed.setName("Passed");
		passed.setValue(40632);

		SeriesData failed = new SeriesData();
		failed.setName("Failed");
		failed.setValue(36953);


		SeriesData timeout = new SeriesData();
		timeout.setName("TimeOut");
		timeout.setValue(31476);


		List<SeriesData> ww1Series = Arrays.asList(passed, failed, timeout);
		ww1.setSeries(ww1Series);
		
		DashboardData ww2 = new DashboardData();
		ww2.setName("WW2");

		SeriesData passedData = new SeriesData();
		passedData.setName("Passed");
		passedData.setValue(0);

		SeriesData failedData = new SeriesData();
		failedData.setName("Failed");
		failedData.setValue(45986);

		SeriesData timeoutData = new SeriesData();
		timeoutData.setName("Time Out");
		timeoutData.setValue(37060);

		List<SeriesData> ww2Series = Arrays.asList(passedData, failedData, timeoutData);
		ww2.setSeries(ww2Series);
		
		list.add(ww1);
		list.add(ww2);
		
		return list;
	}

}
