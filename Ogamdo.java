class Ogamdo {
	public static void main (String[] args)
	{
		int i = 0;

		String ahae1 = "무서운아해";
		String ahae2 = "무서워하는아해";

		System.out.println("\n\t오감도-시제1호\n\t\t\t이상\n\n 13인의아해가도로로질주하오.\n (길은막다른골목길이적당하오.)\n");

		for ( ; i < 13; ){
			char josa = ' ';

			if (i%10 == 1)
				josa = '가';
			else
				josa = '도';

			System.out.println(" 제" +  ++i + "의아해" + josa + "무섭다고그리오.");
			
			if (i%10 == 0)
				System.out.println();
		}

		System.out.println(" " + i + "인의아해는" + ahae1 + "와" + ahae2 + "와그러케뿐이모엿소.\n (다른사정은없는것이차라리나앗소)\n");

		for (int count = 0, j = 0; count < 4; count++){
			String ahae = "";

			if (count < 2){
				j++;
				ahae = ahae1;				
			}
			else if (count > 2){
				j--;
				ahae = ahae2;
			}

			System.out.println(" 그중에" + j + "인의아해가" + ahae + "라도좃소.");
		}

		System.out.println(" (길은뚫닌골목이라도적당하오.)\n\n " + i + "인의아해가도로로질주하지아니하여도좃소.");
	}
}