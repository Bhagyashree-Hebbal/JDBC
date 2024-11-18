package com.xworkz.information.service;

import com.xworkz.information.dto.AppDTO;
import com.xworkz.information.repo.AppRepoImpl;

public class AppServiceImpl implements AppService {

	public boolean save(AppDTO appDTO) {

		boolean isvalid = true;

		if (appDTO == null) {
			isvalid = false;
		}

		if (appDTO.getName().length() < 6 || appDTO.getName().isEmpty()) {
			System.out.println("Name is in-valid");
			isvalid = false;
		}

		if (appDTO.getLastName().length() < 3 || appDTO.getLastName().isEmpty()) {
			System.out.println("Last Name is in-valid");
			isvalid = false;
		}

		if (appDTO.getEmail() == null && !(appDTO.getEmail().contains("@") && (appDTO.getEmail().endsWith(".com") && appDTO.getEmail().indexOf('@') == 8))) {
			System.out.println("Email is in-valid");
			isvalid = false;
		}

		if (appDTO.getAddress().length() < 5) {
			System.out.println("Address is in-valid");
			isvalid = false;
		}
		
		if (!(appDTO.getPhoneNo().length() == 10 && appDTO.getPhoneNo().startsWith("9"))) {
			System.err.println("Phone number is in-valid");
			isvalid = false;
		}

		if (!(appDTO.getAge() > 5 && appDTO.getAge() <= 65)) {
			System.err.println("Age is in-valid");
			isvalid = false;
		}

		if (isvalid) {
			AppRepoImpl appRepoImpl = new AppRepoImpl();
			return appRepoImpl.save(appDTO);
		} else {
			System.out.println("Data validation failed, not saving.");
			return isvalid;
		}
	}
}
