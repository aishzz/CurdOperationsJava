package com.xworkz.custom.repository;

public interface GmailRepository {
		boolean create(String gmail);

		default int totalGmails() {
			return 10;

		}

	}

