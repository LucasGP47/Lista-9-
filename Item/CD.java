package Item;

public class CD {
	
	public String faixas;
	public String artista;
	public String album;
	
	public CD(String faixas) {
		
	}

	public String getFaixas() {
		return faixas;
	}

	public void setFaixas(String faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixas= ");
		builder.append(faixas);
		builder.append(", artista= ");
		builder.append(artista);
		builder.append(", album= ");
		builder.append(album);
		return builder.toString();
	}
	
	
	
	

}
