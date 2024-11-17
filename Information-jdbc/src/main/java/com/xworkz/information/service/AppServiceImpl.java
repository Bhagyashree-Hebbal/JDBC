package com.xworkz.information.service;

import com.xworkz.information.dto.AppDTO;
import com.xworkz.information.repo.AppRepoImpl;

public class AppServiceImpl implements AppService {

	public boolean save(AppDTO appDTO) {

		boolean isvalid = true;

		if (appDTO == null) {
			isvalid = false;
		}

		if (appDTO.getName().length() < 3 || appDTO.getName().isEmpty()) {
			System.out.println("Data is incorrect");
			isvalid = false;
		}

		if (appDTO.getLastName().length() < 3 || appDTO.getLastName().isEmpty()) {
			System.out.println("Data is incorrect");
			isvalid = false;
		}

		if (!(appDTO.getEmail().contains("@gmail") && appDTO.getEmail().endsWith(".com")
				|| appDTO.getEmail().endsWith(".in"))) {
			System.out.println("Data is in correct");
			isvalid = false;
		}

		if (appDTO.getAddress().length() < 5) {
			System.out.println("Dtat is incorrect");
			isvalid = false;
		}

		if (isvalid) {
			AppRepoImpl appRepoImpl = new AppRepoImpl();
			return appRepoImpl.save(appDTO);
		} else {
			System.out.println("Data validation failed, not saving.");
			return false;
		}
	}
}
