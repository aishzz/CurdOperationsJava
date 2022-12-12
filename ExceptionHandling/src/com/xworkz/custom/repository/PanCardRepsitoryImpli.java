package com.xworkz.custom.repository;

import com.xworkz.custom.customException.PanSizeExceededException;

public class PanCardRepsitoryImpli {
	
	public class PanCardRepositoryImpli implements PanCardRepository {
		private String[] panCards = new String[10];
		private int panCardIndex = 0;

		@Override
		public boolean linking(String card) {
			System.out.println("running the linking");
			if (this.panCardIndex > panCards.length) {
				throw new PanSizeExceededException();
			}
			this.panCards[panCardIndex] = card;
			panCardIndex++;
			return false;
		}

		public int total() {
			return PanCardRepository.super.total();

}
	}
}
