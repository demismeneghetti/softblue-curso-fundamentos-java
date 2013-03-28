package programacaoJava03ConceitosIniciais;

public class aula33CastingDeTiposPrimitivos {

	public static void main(String[] args) {

		int x = 10;
		double y = x;
		System.out.println(y);

		// CASTING IMPLICITO
		long l = 10l;
		System.out.println(l);

		float f = 10f;
		System.out.println(f);

		// CASTING EXPLICITO - É necessário a intervensão do programador.
		int i = (int) 14.5;
		System.out.println(i);

		byte b = (byte) 128;
		System.out.println(b);

	}
}
