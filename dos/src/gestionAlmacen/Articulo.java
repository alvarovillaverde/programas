package gestionAlmacen;

import java.io.Serializable;

public class Articulo implements Serializable, Comparable<Articulo>{

	  // atributo de clase
	  private static int contador = 1;
      // atributo de objeto
	  private String descripcion;
	  private double precioCompra;
	  private double precioVenta;
	  private int stock;
	  /**
	   * Identifica al artículo. Será único
	   */
	  private int codigo;

	  /**
	   * Constructor de la clase artículo
	   * 
	   * @param descripcion
	   * @param precioCompra
	   * @param precioVenta
	   * @param stock
	   * @throws StockNegativoException
	   * @throws PrecioCompraNegativoException
	   * @throws PrecioVentaNegativoException
	   */
	  Articulo(String descripcion, double precioCompra, double precioVenta, int stock)
	      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
	    setDescripcion(descripcion);
	    setPrecioCompra(precioCompra);
	    setPrecioVenta(precioVenta);
	    setStock(stock);
        // atencion a la llamada setCodigo
	    setCodigo();
	  }

	  Articulo(int codigoArticulo) {
	    setCodigo(codigoArticulo);
	  }

	  // codigo autoincremental primary key
	  private void setCodigo() {
	    this.codigo = Articulo.contador++;
	  }

      // tambien se puede usar este set para poner el codigo que nos parezca
	  private void setCodigo(int codigo) {
	    this.codigo = codigo;
	  }

	  /**
	   * Getter del código
	   * 
	   * @return codigo del artículo
	   */
	  public int getCodigo() {
	    return codigo;
	  }

	  /**
	   * Getter de la descripción
	   * 
	   * @return the descripcion
	   */
	  public String getDescripcion() {
	    return descripcion;
	  }

	  /**
	   * Setter de la descripción
	   * 
	   * @param descripcion
	   *          the descripcion to set
	   */
	  void setDescripcion(String descripcion) {
	    this.descripcion = descripcion;
	  }

	  /**
	   * Getter precio de compra
	   * 
	   * @return the precioCompra
	   */
	  public double getPrecioCompra() {
	    return precioCompra;
	  }

	  /**
	   * Setter de precio de compra en el que se controla que el precio de compra no
	   * sea negativo
	   * 
	   * @param precioCompra
	   *          the precioCompra to set
	   * @throws PrecioCompraNegativoException
	   */
	  void setPrecioCompra(double precioCompra) throws PrecioCompraNegativoException {
	    if (precioCompra >= 0) {
	      this.precioCompra = precioCompra;
	    } else
	        throw new PrecioCompraNegativoException("El precio de compra no puede ser negativo.");
	  }

	  /**
	   * Getter precio de venta
	   * 
	   * @return the precioVenta
	   */
	  public double getPrecioVenta() {
	    return precioVenta;
	  }

	  /**
	   * Setter precio de venta en el que se controla que el precio de venta no sea
	   * negativo
	   * 
	   * @param precioVenta
	   *          the precioVenta to set
	   * @throws PrecioVentaNegativoException
	   */
	  void setPrecioVenta(double precioVenta) throws PrecioVentaNegativoException {
	    if (precioVenta >= 0) {
	      this.precioVenta = precioVenta;
	    } else
	        throw new PrecioVentaNegativoException("El precio de venta no puede ser negativo.");

	  }

	  /**
	   * Getter del stock
	   * 
	   * @return the stock
	   */
	  public int getStock() {
	    return stock;
	  }

	  /**
	   * Setter de stock en el que se controla que el stock no sea negativo
	   * 
	   * @param stock
	   *          the stock to set
	   * @throws StockNegativoException
	   */
	  void setStock(int stock) throws StockNegativoException {
	    if (stock >= 0) {
	      this.stock = stock;
	    } else
	        throw new StockNegativoException("El stock no puede ser negativo.");
	  }

	  /**
	   * Método para aumentar el stock
	   * 
	   * @param cantidad
	   * @throws StockNegativoException
	   * @throws CantidadNegativaException
	   */
	  public void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
	    if (cantidad > 0)
	      setStock(getStock() + cantidad);
	    else
	      throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
	  }

	  /**
	   * Método para aumentar el stock
	   * 
	   * @param cantidad
	   * @throws CantidadNegativaException
	   * @throws StockNegativoException
	   */
	  public void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
	    if (cantidad > 0)
	      setStock(getStock() - cantidad);
	    else
	      throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
	  }

	  /*
	   * (non-Javadoc)
	   * 
	   * @see java.lang.Object#hashCode()
	   */
	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + codigo;
	    return result;
	  }

	  /*
	   * (non-Javadoc)
	   * 
	   * @see java.lang.Object#equals(java.lang.Object)
	   */
	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Articulo other = (Articulo) obj;
	    return this.codigo == other.codigo;
	  }

	  /*
	   * (non-Javadoc)
	   * 
	   * @see java.lang.Object#toString()
	   */
	  @Override
	  public String toString() {
	    return "\nCodigo: " + getCodigo() + "\nDescripcion: " + getDescripcion() + "\nPrecioCompra: " + getPrecioCompra()
	        + "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock() + "\n'''''''''''''''''''''''''''''''''''''''";
	  }

	  /**
	   * Método set usado en Almacen para realizar la modificación.
	   * 
	   * @param descripcion
	   * @param precioCompra
	   * @param precioVenta
	   * @param stock
	   * @throws StockNegativoException
	   * @throws PrecioCompraNegativoException
	   * @throws PrecioVentaNegativoException
	   */
	  public void set(String descripcion, double precioCompra, double precioVenta, int stock)
	      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
	    setDescripcion(descripcion);
	    setPrecioCompra(precioCompra);
	    setPrecioVenta(precioVenta);
	    setStock(stock);
	  }

	  @Override
	  public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
	  }

}
