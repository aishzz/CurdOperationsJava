package com.xworkz.CurdException.repository;

import com.xworkz.CurdException.dto.IplDTO;

public interface IplRepository {
	boolean makeTeam(IplDTO dto);

	default int total() {
		return 0;
	}

}


