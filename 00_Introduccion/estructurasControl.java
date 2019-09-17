class EstructurasControl{
  public static void main(String[] argumentos){
	/*for(int i = 0; i < argumentos.length; i++){
		System.out.println("Arg " + i);
		System.out.println("Arg " + argumentos[i]);
	}*/
	/*
	int i = 0;
	while (i < argumentos.length;){
		System.out.println("Arg " + i);
		System.out.println("Arg " + argumentos[i]);
		i++;
	}*/
	do{
		System.out.println("Siempre se muestra");
	} while(false);
	
	boolean siEjecutar = ( 5 < 3) && (20 == 20);
	
	if (siEjecutar){
		System.out.println("Cierto");
	} else if (5 == 3){
		System.out.println("La condicion es rara");
	} else if (8 == 3){
		System.out.println("La condicion es rara");
	}
	else {
		System.out.println("Falso");
	}
	int valor = 1;
	switch(valor){
		case 0: 
			System.out.println("Valor cero");
			break;
		case 1:
			System.out.println("Valor 1");
			break;
		case 2:
			System.out.println("Valor 2");
			break;
		default: 
			System.out.println("Otro valor");
			break;
	}
  }
}