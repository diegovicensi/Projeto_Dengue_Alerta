package br.edu.atitus.videos.denguealerta.entities;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
		private UUID id;

		public UUID getId() {
			return id;
		}

		public void setId(UUID id) {
			this.id = id;
		}
		
}
