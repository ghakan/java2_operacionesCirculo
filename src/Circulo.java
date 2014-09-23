/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Circulo {


 //Método que calcula el area
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

}
