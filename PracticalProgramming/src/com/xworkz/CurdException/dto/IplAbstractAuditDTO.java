package com.xworkz.CurdException.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class IplAbstractAuditDTO implements Serializable {

		private String createdBy;
		private LocalDateTime createDate;
		private String updatedBy;
		private LocalDateTime updatedDate;

		public IplAbstractAuditDTO() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "IplAbstractAuditDTO [createdBy=" + createdBy + ", createDate=" + createDate + ", updatedBy=" + updatedBy
					+ ", updatedDate=" + updatedDate + "]";
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public LocalDateTime getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDateTime createDate) {
			this.createDate = createDate;
		}

		public String getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public LocalDateTime getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(LocalDateTime updatedDate) {
			this.updatedDate = updatedDate;
		}

}
