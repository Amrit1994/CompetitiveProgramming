package com.main;

import com.module.Parking;

public class ParkingSolution {

	Parking[] park = new Parking[7];
	int count = 1;

	/*
	 * public void createParkingSlot(String registrationNo, String colour) {
	 * System.out.println("Allocated slot number: " + count); if (count <= 6) {
	 * park[count++] = new Parking(registrationNo, colour); } else {
	 * System.out.println("Sorry, parking lot is full"); }
	 * 
	 * }
	 */

	public void createParkingSlot(String registrationNo, String colour) {
		boolean flag = false;

		while (count <= 6) {
			flag = false;
			if (park[count] == null) {
				System.out.println("Allocated slot number: " + count);
				park[count++] = new Parking(registrationNo, colour);
				flag = true;
				break;
			} else {
				count++;
				flag = false;
			}
		}
		if (!flag) {
			System.out.println();
			System.out.println("Sorry, parking lot is full");
		}
	}

	public int removeParkingSlot(int slotNo) {
		int deletedSlot = 0;
		if (park == null || slotNo < 0 || slotNo >= park.length) {
			return -1;
		} else {
			for (int i = 1; i <= park.length-1; i++) {
				if (i == slotNo) {
					park[i] = null;
					deletedSlot = i;
					break;
				} else {
					continue;
				}
			}
		}
		return deletedSlot;

	}

	public void printParkingData() {

		System.out.println("Slot No." + " " + "Registration No " + " " + "Color");
		System.out.println();
		for (int i = 1; i <= park.length - 1; i++) {
			if (park[i] != null) {
				System.out.println(i + "        " + park[i].getRegistrationNo() + "    " + park[i].getColour());
			}
		}
	}

	public String[] getRegistrationNoByColor(String color) {
		String[] arr = new String[7];
		for (int i = 1; i <= park.length - 1; i++) {
			if (park[i] != null && park[i].getColour().equals(color)) {
				arr[i] = park[i].getRegistrationNo();
			}
		}
		return arr;
	}

	public int[] getSlotNoByColor(String color) {
		int arr[] = new int[7];
		for (int i = 1; i <= park.length - 1; i++) {
			if (park[i].getColour().equals(color)) {
				arr[i] = i;
			}
		}
		return arr;
	}

	public int getSlotNoByRegistration(String reg) {
		int slotNo = 0;
		boolean flag = false;
		for (int i = 1; i <= park.length - 1; i++) {
			if (park[i].getRegistrationNo().equals(reg)) {
				slotNo = i;
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (!flag) {
			slotNo = -1;
		}
		return slotNo;
	}

	public static void main(String[] args) {
		ParkingSolution parkingSolution = new ParkingSolution();
		System.out.println("Created a parking lot with " + (parkingSolution.park.length - 1) + " slots");
		parkingSolution.createParkingSlot("KA-01-HH-1234", "White");
		parkingSolution.createParkingSlot("KA-01-HH-9999", "White");
		parkingSolution.createParkingSlot("KA-01-BB-0001", "Black");
		parkingSolution.createParkingSlot("KA-01-HH-7777", "Red");
		parkingSolution.createParkingSlot("KA-01-HH-2701", "Blue");
		parkingSolution.createParkingSlot("KA-01-HH-3141", "Black");
//		parkingSolution.printParkingData();

		System.out.println("Slot number " + parkingSolution.removeParkingSlot(4) + " is free");
		System.out.println();
		parkingSolution.printParkingData();
		System.out.println();
		parkingSolution.count = 1;
		parkingSolution.createParkingSlot("KA-01-P-333", "White");
		parkingSolution.createParkingSlot("DL-12-AA-9999", "White");

//		registration_numbers_for_cars_with_colour White
		String[] arr = parkingSolution.getRegistrationNoByColor("White");
		if (arr.length > 0) {
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i <= arr.length - 1; i++) {
				if (arr[i] != null) {
					builder.append(arr[i]).append(", ");
				}
			}
			System.out.println();
			System.out.println(builder.deleteCharAt(builder.length() - 2).toString());
		}

		// slot_numbers_for_cars_with_colour White
		int[] slotArr = parkingSolution.getSlotNoByColor("White");
		if (slotArr.length > 0) {
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i <= arr.length - 1; i++) {
				if (slotArr[i] != 0) {
					builder.append(slotArr[i]).append(", ");
				}
			}
			System.out.println();
			System.out.println(builder.deleteCharAt(builder.length() - 2).toString());
		}

//		slot_number_for_registration_number
		if (parkingSolution.getSlotNoByRegistration("KA-01-HH-3141") > 0) {
			System.out.println(parkingSolution.getSlotNoByRegistration("KA-01-HH-3141"));
		} else {
			System.out.println("Not found");
		}

		if (parkingSolution.getSlotNoByRegistration("MH-04-AY-1111") > 0) {
			System.out.println(parkingSolution.getSlotNoByRegistration("MH-04-AY-1111"));
		} else {
			System.out.println("Not found");
		}
	}

}
