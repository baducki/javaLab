class Ogamdo {
	public static void main (String[] args)
	{
		int i = 0, j = 0;

		String ahae1 = "무서운아해";
		String ahae2 = "무서워하는아해";
		String musup = "무섭다고그리오.";

		System.out.println("\t오감도-시제1호");
		System.out.println("\t\t\t이상\n");
		System.out.println(" 13인의아해가도로로질주하오.\n (길은막다른골목길이적당하오.)\n");

		for ( ; i < 13; ){
			System.out.print(" 제" +  ++i + "의아해");

			if (i%10 == 1)
				System.out.print("가");
			else
				System.out.print("도");

			System.out.println(musup);
			
			if (i%10 == 0)
				System.out.println();
		}

		System.out.println(" " + i + "인의아해는" + ahae1 + "와" + ahae2 + "와그러케뿐이모엿소.\n (다른사정은없는것이차라리나앗소)\n");

		for (j = 0; j < 2; ){
			System.out.println(" 그중에" + ++j + "인의아해가" + ahae1 + "라도좃소.");
		}

		for ( ; j > 0; j--){
			System.out.println(" 그중에" + j + "인의아해가" + ahae2 + "라도좃소.");
		}

		System.out.println(" (길은뚫닌골목이라도적당하오.)\n\n " + i + "인의아해가도로로질주하지아니하여도좃소.");
	}
}