package br.edu.atitus.videos.denguealerta.services;

import org.springframework.stereotype.Service;
import br.edu.atitus.videos.denguealerta.entities.FocoEntity;
import br.edu.atitus.videos.denguealerta.repositories.FocoRepository;
import br.edu.atitus.videos.denguealerta.repositories.GenericRepository;

@Service
public class FocoService extends GenericService<FocoEntity> {
	
	private final FocoRepository focoRepository;
	

	public FocoService(FocoRepository focoRepository) {
		super();
		this.focoRepository = focoRepository;
	}

	@Override
	protected GenericRepository<FocoEntity> getRepository() {
		return this.focoRepository;
	}

	@Override
	protected void validate(FocoEntity entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
