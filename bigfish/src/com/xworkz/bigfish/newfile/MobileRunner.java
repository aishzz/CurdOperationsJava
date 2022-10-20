package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

				long[] mobileNumbers = { 8970877229l, 89708475596l };
				String[] entertainmentApps = { "NetFlix", "Amazon Prime", "Aha", "Zee5" };
				String[] googleApps = { "Google browser", "Google Drive", "Youtube", "Gmail" };
				String[] educationalApps = { "VisionIas", "Java Pattern Programs Free", "Brainly" };
				String[] bankingApps = { "PhonePe", "PayTM", "GooglePay" };
				String[] musicApps = { "Wynk music", "Spotify", "JioSaavn" };

				Mobile mobile = new Mobile("OnePlus Nord", "Android", 12, 256, 11, mobileNumbers, entertainmentApps,
						googleApps, educationalApps, bankingApps, musicApps);

				mobile.display();

			}

	}

