
public abstract class Vehiculo {
	protected String patente;
	protected Integer precioBase = 900;
	protected Double precioTotal;
	protected Integer pasajeros;
	
	public String getPatente()
	{
		return this.patente;
	}
	
	public void setPatente(String patente)
	{
		this.patente = patente;
	}
	
	public Integer getPrecioBase()
	{
		return this.precioBase;
	}
	
	public void setPrecioBase(Integer precio)
	{
		this.precioBase = precio;
	}
	
	public Double getPrecioTotal()
	{
		return this.precioTotal;
	}
	
	public void setPrecioTotal(Double precio)
	{
		this.precioTotal = precio;
	}
		
	public Integer getPasajeros()
	{
		return this.pasajeros;
	}
	
	public void setPasajeros(Integer pasajeros)
	{
		this.pasajeros = pasajeros;
	}
	
	public abstract Double calcular(Integer dias);
}
