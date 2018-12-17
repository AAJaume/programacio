//jugadores
//Jaume Bota Ian Lavergne
public class jugador {//equips
  
	//Atributos
	private String nombre;
	private int vida;
	private int misiles_ronda;
	private int misiles_antes_de_ronda;
	private static int numero_de_equipos;
	private static int tipo_planeta;
	private int contadormisils;//contador de misiles para cada equipo
	private int contadormisilsequips;//contador de misiles para diferentes equipos
	private int totalcontadormisils;//total contador de misils 
	private int decontadormisils;//entrada de misils per al equip
	private int resultatequip;//contador de misils per a cada equip
  
	//Metodos Para Jugador
	public jugador() {//metodo creador
		this.nombre="a";
		this.vida=200;
		this.misiles_ronda=50;
		this.tipo_planeta=0;
		this.contadormisils=0;
		this.contadormisilsequips=0;
		this.totalcontadormisils=0;
		this.decontadormisils=0;
		this.resultatequip=0;
	}
  
  	public static int getTipo_planeta() {
		return tipo_planeta;
	}

	public static void setTipo_planeta(int tipo_planeta) {
		jugador.tipo_planeta = tipo_planeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMisiles_ronda() {
		return misiles_ronda;
	}

	public void setMisiles_ronda(int misiles_ronda) {
		this.misiles_ronda = misiles_ronda;
	}

	public int getMisiles_antes_de_ronda() {
		return misiles_antes_de_ronda;
	}

	public void setMisiles_antes_de_ronda(int misiles_antes_de_ronda) {
		this.misiles_antes_de_ronda = misiles_antes_de_ronda;
	}

	public static int getNumero_de_equipos() {
		return numero_de_equipos;
	}

	public static int setNumero_de_equipos(int numero_de_equipos) {
		return jugador.numero_de_equipos = numero_de_equipos;
	}
	//Metodos para los misiles 

	public int getContadormisils() {
		return contadormisils;
	}

	public void setContadormisils(int contadormisils) {
		this.contadormisils = contadormisils;
	}

	public int getContadormisilsequips() {
		return contadormisilsequips;
	}

	public void setContadormisilsequips(int contadormisilsequips) {
		this.contadormisilsequips = contadormisilsequips;
	}

	public int getTotalcontadormisils() {
		return totalcontadormisils;
	}

	public void setTotalcontadormisils(int totalcontadormisils) {
		this.totalcontadormisils = totalcontadormisils;
	}

	public int getDecontadormisils() {
		return decontadormisils;
	}

	public void setDecontadormisils(int decontadormisils) {
		this.decontadormisils = decontadormisils;
	}

	public int getResultatequip() {
		return resultatequip;
	}

	public void setResultatequip(int resultatequip) {
		this.resultatequip = resultatequip;
	}
  

  }    


