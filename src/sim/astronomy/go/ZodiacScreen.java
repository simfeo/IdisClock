package sim.astronomy.go;import android.content.res.Resources;import android.os.Bundle;import android.support.v4.app.Fragment;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.TextView;public class ZodiacScreen extends Fragment {	static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";	int pageNumber;	int backColor;	View view;	private TextView Oven, Oven1, Telez, Telez1, Bliznez, Bliznez1, Rak, Rak1, Lev, Lev1, Deva, Deva1, Vesi, Vesi1, Scorpi, Scorpi1, Strelez, Strelez1, Kozer, Kozer1, Vodol, Vodol1, Ribi, Ribi1;	private TextView act_m2, act_m1, act, act_1, act_2; 	Resources res;	static ZodiacScreen newInstance(int page) {		ZodiacScreen fragFrag = new ZodiacScreen();		Bundle arguments = new Bundle();		arguments.putInt(ARGUMENT_PAGE_NUMBER, page);		fragFrag.setArguments(arguments);		return fragFrag;	}	@Override	public void onCreate(Bundle savedInstanceState) {		super.onCreate(savedInstanceState);		pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);		res =getResources();	}	@Override	public View onCreateView(LayoutInflater inflater, ViewGroup container,			Bundle savedInstanceState) {		view = inflater.inflate(R.layout.zodiac, null);		Oven=(TextView) view.findViewById(R.id.oven1);		Oven1=(TextView) view.findViewById(R.id.oven2);		Telez=(TextView) view.findViewById(R.id.telez1);		Telez1=(TextView) view.findViewById(R.id.telez2);		Bliznez=(TextView) view.findViewById(R.id.bliznez1);		Bliznez1=(TextView) view.findViewById(R.id.bliznez2);		Rak=(TextView) view.findViewById(R.id.rak1);		Rak1=(TextView) view.findViewById(R.id.rak2);		Lev=(TextView) view.findViewById(R.id.lev1);		Lev1=(TextView) view.findViewById(R.id.lev2);		Deva=(TextView) view.findViewById(R.id.deva1);		Deva1=(TextView) view.findViewById(R.id.deva2);		Vesi=(TextView) view.findViewById(R.id.vesi1);		Vesi1=(TextView) view.findViewById(R.id.vesi2);		Scorpi=(TextView) view.findViewById(R.id.scorpi1);		Scorpi1=(TextView) view.findViewById(R.id.scorpi2);		Strelez=(TextView) view.findViewById(R.id.strelez1);		Strelez1=(TextView) view.findViewById(R.id.strelez2);		Kozer=(TextView) view.findViewById(R.id.kozer1);		Kozer1=(TextView) view.findViewById(R.id.kozer2);		Vodol=(TextView) view.findViewById(R.id.vodol1);		Vodol1=(TextView) view.findViewById(R.id.vodol2);		Ribi=(TextView) view.findViewById(R.id.ribi1);		Ribi1=(TextView) view.findViewById(R.id.ribi2);		act_m2=(TextView) view.findViewById(R.id.act_m2);		act_m1=(TextView) view.findViewById(R.id.act_m1);		act=(TextView) view.findViewById(R.id.act);		act_1=(TextView) view.findViewById(R.id.act_1);		act_2=(TextView) view.findViewById(R.id.act_2);				{String dt=new java.text.SimpleDateFormat("dd-MM-yyyy").format(java.util.Calendar.getInstance ().getTime());		String days[]=dt.split("-");		int	day=Integer.parseInt(days[0]);		int mon=Integer.parseInt(days[1]);		int year=Integer.parseInt(days[2]);		yyyer (year-2, act_m2);		yyyer (year-1, act_m1);		yyyer (year, act);		yyyer (year+1, act_1);		yyyer (year+2, act_2);		if ((mon==3 && day>=21)  || (mon==4 && day<=20)) 			zhir (Oven, Oven1);		if ((mon==4 && day>=21)  || (mon==5 && day<=20)) 			zhir (Telez, Telez1);		if ((mon==5 && day>=21)  || (mon==6 && day<=21)) 			zhir (Bliznez, Bliznez1);		if ((mon==6 && day>=22)  || (mon==7 && day<=22)) 			zhir (Rak, Rak1);		if ((mon==7 && day>=23)  || (mon==8 && day<=23)) 			zhir (Lev, Lev1);		if ((mon==8 && day>=24)  || (mon==9 && day<=23)) 			zhir (Deva, Deva1);		if ((mon==9 && day>=24)  || (mon==10 && day<=22)) 			zhir (Vesi, Vesi1);		if ((mon==10 && day>=23) || (mon==11 && day<=22)) 			zhir (Scorpi, Scorpi1);		if ((mon==11 && day>=23) || (mon==12 && day<=21)) 			zhir (Strelez, Strelez1);		if ((mon==12 && day>=22) || (mon==1 && day<=20)) 			zhir (Kozer, Kozer1);		if ((mon==1 && day>=21)  || (mon==2 && day<=19)) 			zhir (Vodol, Vodol1);		if ((mon==2 && day>=20)  || (mon==3 && day<=20)) 			zhir (Ribi, Ribi1);		}		return view;	}	public void yyyer (int a, TextView la){		//String [] yearch = {"�����", "���", "����", "������", "������", "����", "������", "����", "��������", "�����", "������", "������"};		String [] yearch = res.getStringArray(R.array.ZodiacAnimal);		a=(a-1900)%12;		la.setText(yearch[a]);	}	public void zhir (TextView lala1, TextView lala2){		lala1.setTypeface(null, 1);		lala1.setTextSize(1,15);		lala1.setTextColor(0xFFCC3333);		lala2.setTypeface(null, 1);		lala2.setTextSize(1, 15);		lala2.setTextColor(0xFFCC3333);	}}