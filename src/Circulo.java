/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Circulo {

	private float radio = 0;
	private float circu = 0;
	private float area = 0;

      public void setRadio(float num)
        {
              	this.radio = num;
		this.area = 3.14f * num * num;
		this.circu = 2 * 3.14f * num;
        }

 	public float getArea() {
        return area;
    }
 	public float getCircu() {
        return circu;
    }
	

 /*Método que calcula el area
 public float area (float num) {

	float pi = 3.14f;
	float result = 0;
	result = pi * num * num;
	return result;
 }



 //Método que calcula la circunferencia
 public float circunferencia (float num) {

	float pi = 3.14f;
	float result = 0;
	result = 2 * pi * num;
	return result;
 }
*/
}
