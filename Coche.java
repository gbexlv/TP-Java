
public class Coche extends Vehiculo {
	public Double calcular(Integer cantDias)
	{
		Integer precioBase = this.getPrecioBase();
		Double precioTotal;
		
		precioTotal = precioBase * cantDias * 1.0;
		this.setPrecioTotal(precioTotal);
		
		return this.getPrecioTotal();
	}
	
	public Integer getPrecioBase()
	{
		this.setPrecioBase(super.getPrecioBase() + (this.getPasajeros() * 150));
		return this.precioBase;
	}
}
