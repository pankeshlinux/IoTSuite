// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-10-27 11:55:59
 
package iotsuite.parser;
import iotsuite.compiler.*;  
import iotsuite.semanticmodel.*;   
      


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VocabSpecParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", 
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", 
		"'_'", "'accessed-by'", "'action'", "'actuators'", "'boolean'", "'double'", 
		"'eventdriven'", "'for'", "'generate'", "'long'", "'onCondition'", "'period'", 
		"'periodicsensors'", "'resources'", "'sample'", "'sensors'", "'storages'", 
		"'structs'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public VocabSpecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public VocabSpecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return VocabSpecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g"; }


	  private SymbolTable context;



	// $ANTLR start "vocabSpec"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:23:1: vocabSpec : 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
	public final void vocabSpec() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:23:11: ( 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:4: 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
			{
			 
			    context = new SymbolTable();
			    
			match(input,33,FOLLOW_33_in_vocabSpec75); 
			match(input,11,FOLLOW_11_in_vocabSpec77); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:27:19: ( struct_def )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CAPITALIZED_ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:27:20: struct_def
					{
					pushFollow(FOLLOW_struct_def_in_vocabSpec80);
					struct_def();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,29,FOLLOW_29_in_vocabSpec90); 
			match(input,11,FOLLOW_11_in_vocabSpec92); 
			pushFollow(FOLLOW_abilities_def_in_vocabSpec94);
			abilities_def();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "vocabSpec"



	// $ANTLR start "struct_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:31:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:31:11: ( CAPITALIZED_ID ( structField_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:5: CAPITALIZED_ID ( structField_def ';' )*
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def112); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			    context.constructStructNameSymblTable((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:35:5: ( structField_def ';' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:35:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def126);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def128); 
					}
					break;

				default :
					break loop2;
				}
			}


			     context.currentStruct.generateStructureCode();  
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "struct_def"



	// $ANTLR start "structField_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:16: ( lc_id ':' dataType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:41:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def151);
			lc_id2=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def153); 
			pushFollow(FOLLOW_dataType_in_structField_def155);
			dataType3=dataType();
			state._fsp--;

			 
			    context.currentStruct.addField((lc_id2!=null?input.toString(lc_id2.start,lc_id2.stop):null), (dataType3!=null?input.toString(dataType3.start,dataType3.stop):null));
			   context.constructStructFieldSymblTable((lc_id2!=null?input.toString(lc_id2.start,lc_id2.stop):null),(dataType3!=null?input.toString(dataType3.start,dataType3.stop):null));
			    context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "structField_def"



	// $ANTLR start "abilities_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:49:1: abilities_def : ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:49:15: ( ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:3: ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )*
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:3: ( 'sensors' ':' sensor_def )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==31) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:4: 'sensors' ':' sensor_def
					{
					match(input,31,FOLLOW_31_in_abilities_def180); 
					match(input,11,FOLLOW_11_in_abilities_def182); 
					pushFollow(FOLLOW_sensor_def_in_abilities_def186);
					sensor_def();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:4: ( 'actuators' ':' actuator_def )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==19) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:5: 'actuators' ':' actuator_def
					{
					match(input,19,FOLLOW_19_in_abilities_def194); 
					match(input,11,FOLLOW_11_in_abilities_def196); 
					pushFollow(FOLLOW_actuator_def_in_abilities_def198);
					actuator_def();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:3: ( 'storages' ':' ss_def )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==32) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:4: 'storages' ':' ss_def
					{
					match(input,32,FOLLOW_32_in_abilities_def205); 
					match(input,11,FOLLOW_11_in_abilities_def208); 
					pushFollow(FOLLOW_ss_def_in_abilities_def210);
					ss_def();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "abilities_def"



	// $ANTLR start "sensor_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:1: sensor_def : ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )* ;
	public final void sensor_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:11: ( ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:7: ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )*
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:7: ( 'periodicsensors' ':' ( periodicsensor_def )* )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==28) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:8: 'periodicsensors' ':' ( periodicsensor_def )*
					{
					match(input,28,FOLLOW_28_in_sensor_def233); 
					match(input,11,FOLLOW_11_in_sensor_def235); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:29: ( periodicsensor_def )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CAPITALIZED_ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:30: periodicsensor_def
							{
							pushFollow(FOLLOW_periodicsensor_def_in_sensor_def237);
							periodicsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

				default :
					break loop7;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:7: ( 'eventdriven' ':' ( eventsensor_def )* )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==22) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:8: 'eventdriven' ':' ( eventsensor_def )*
					{
					match(input,22,FOLLOW_22_in_sensor_def250); 
					match(input,11,FOLLOW_11_in_sensor_def252); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:26: ( eventsensor_def )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CAPITALIZED_ID) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:27: eventsensor_def
							{
							pushFollow(FOLLOW_eventsensor_def_in_sensor_def255);
							eventsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensor_def"



	// $ANTLR start "periodicsensor_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:60:1: periodicsensor_def : CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* ;
	public final void periodicsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:60:19: ( CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:61:2: CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )*
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_periodicsensor_def269); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:63:5: ( sensorMeasurementForPeriodic_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==24) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:63:6: sensorMeasurementForPeriodic_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def282);
					sensorMeasurementForPeriodic_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def284); 
					}
					break;

				default :
					break loop10;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:64:5: ( sensorperiodicMeasurement_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==30) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:64:6: sensorperiodicMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def294);
					sensorperiodicMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def296); 
					}
					break;

				default :
					break loop11;
				}
			}

			context.currentSensor.generatePeriodicSensorCode();        
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "periodicsensor_def"



	// $ANTLR start "eventsensor_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:1: eventsensor_def : CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* ;
	public final void eventsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:16: ( CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:70:2: CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )*
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_eventsensor_def313); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:5: ( sensorMeasurementForEventDriven_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==24) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:6: sensorMeasurementForEventDriven_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def326);
					sensorMeasurementForEventDriven_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def328); 
					}
					break;

				default :
					break loop12;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:73:5: ( sensoreventMeasurement_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==12||LA13_0==26) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:73:6: sensoreventMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensoreventMeasurement_def_in_eventsensor_def338);
					sensoreventMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def340); 
					}
					break;

				default :
					break loop13;
				}
			}

			context.currentSensor.generateEventDrivenSensorCode();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eventsensor_def"



	// $ANTLR start "sensorMeasurementForEventDriven_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:78:1: sensorMeasurementForEventDriven_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForEventDriven_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		ParserRuleReturnScope lc_id6 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:78:36: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:79:1: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForEventDriven_def357); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def359);
			lc_id6=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForEventDriven_def361); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def364); 
			  
			    context.currentSensor.addSensorMeasurement((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null) , context.getStructSymblTable((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null)) ); 
			    context.constructSymbTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			    context.constructEventDrivenSymblTable((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensorMeasurementForEventDriven_def"



	// $ANTLR start "sensorMeasurementForPeriodic_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:87:1: sensorMeasurementForPeriodic_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForPeriodic_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;
		ParserRuleReturnScope lc_id8 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:87:34: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:88:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForPeriodic_def387); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def389);
			lc_id8=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForPeriodic_def391); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def394); 
			      
			    context.currentSensor.addSensorMeasurement((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null) , context.getStructSymblTable((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)) ); 
			    context.constructSymbTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));  
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensorMeasurementForPeriodic_def"



	// $ANTLR start "sensorperiodicMeasurement_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:95:1: sensorperiodicMeasurement_def : 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* ;
	public final void sensorperiodicMeasurement_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:95:30: ( 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:2: 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )*
			{
			match(input,30,FOLLOW_30_in_sensorperiodicMeasurement_def419); 
			match(input,27,FOLLOW_27_in_sensorperiodicMeasurement_def421); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:20: ( sample_period_def )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==INT) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:21: sample_period_def
					{
					pushFollow(FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def424);
					sample_period_def();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,23,FOLLOW_23_in_sensorperiodicMeasurement_def428); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:47: ( sample_duration_def )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==INT) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:48: sample_duration_def
					{
					pushFollow(FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def431);
					sample_duration_def();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensorperiodicMeasurement_def"



	// $ANTLR start "sample_period_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:99:1: sample_period_def : INT ;
	public final void sample_period_def() throws RecognitionException {
		Token INT10=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:99:19: ( INT )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:100:3: INT
			{
			INT10=(Token)match(input,INT,FOLLOW_INT_in_sample_period_def446); 

			context.currentSensor.addSensorMeasurementSamplePeriod((INT10!=null?INT10.getText():null));

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sample_period_def"



	// $ANTLR start "sample_duration_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:106:1: sample_duration_def : INT ;
	public final void sample_duration_def() throws RecognitionException {
		Token INT11=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:106:21: ( INT )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:107:1: INT
			{
			INT11=(Token)match(input,INT,FOLLOW_INT_in_sample_duration_def459); 

			context.currentSensor.addSensorMeasurementSampleDuration((INT11!=null?INT11.getText():null));

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sample_duration_def"



	// $ANTLR start "sensoreventMeasurement_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:113:1: sensoreventMeasurement_def : ( 'onCondition' ( ID | ',' ID )* )* ;
	public final void sensoreventMeasurement_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:113:27: ( ( 'onCondition' ( ID | ',' ID )* )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2: ( 'onCondition' ( ID | ',' ID )* )*
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2: ( 'onCondition' ( ID | ',' ID )* )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==26) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2: 'onCondition' ( ID | ',' ID )*
					{
					match(input,26,FOLLOW_26_in_sensoreventMeasurement_def471); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:16: ( ID | ',' ID )*
					loop16:
					while (true) {
						int alt16=3;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID) ) {
							alt16=1;
						}
						else if ( (LA16_0==10) ) {
							alt16=2;
						}

						switch (alt16) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:17: ID
							{
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def474); 
							}
							break;
						case 2 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:21: ',' ID
							{
							match(input,10,FOLLOW_10_in_sensoreventMeasurement_def477); 
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def479); 
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

				default :
					break loop17;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sensoreventMeasurement_def"



	// $ANTLR start "actuator_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:1: actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID12=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:13: ( CAPITALIZED_ID ( action_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:118:4: CAPITALIZED_ID ( action_def ';' )*
			{
			CAPITALIZED_ID12=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def494); 
			context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:120:4: ( action_def ';' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==18) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:120:5: action_def ';'
					{
					pushFollow(FOLLOW_action_def_in_actuator_def506);
					action_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_actuator_def508); 
					}
					break;

				default :
					break loop18;
				}
			}

			context.currentActuator.generateActuatorCode();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "actuator_def"



	// $ANTLR start "action_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:123:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID13=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:123:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_action_def530); 
			CAPITALIZED_ID13=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def532); 
			match(input,8,FOLLOW_8_in_action_def534); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:33: ( parameter_def )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ID) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:34: parameter_def
					{
					pushFollow(FOLLOW_parameter_def_in_action_def537);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_action_def541); 
			 context.currentActuator.addAction((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "action_def"



	// $ANTLR start "parameter_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:128:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID14=null;
		ParserRuleReturnScope lc_id15 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:128:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_parameter_def561);
			lc_id15=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_parameter_def563); 
			CAPITALIZED_ID14=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def566); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:31: ( ',' parameter_def )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==10) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:32: ',' parameter_def
					{
					match(input,10,FOLLOW_10_in_parameter_def569); 
					pushFollow(FOLLOW_parameter_def_in_parameter_def571);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			     context.constructActuatorSymblTable((CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));
			    
			    context.currentActuator.addParameter((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null), (CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null)); 
			    context.constructSymbTable((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null), (CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));
			   
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameter_def"



	// $ANTLR start "ss_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:138:1: ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID16=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:138:7: ( CAPITALIZED_ID ( storageDataAccess_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:139:3: CAPITALIZED_ID ( storageDataAccess_def ';' )*
			{
			CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def589); 
			 context.currentStorageService = new StorageCompiler();
			      
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:5: ( storageDataAccess_def ';' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==24) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:6: storageDataAccess_def ';'
					{
					pushFollow(FOLLOW_storageDataAccess_def_in_ss_def602);
					storageDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def604); 
					}
					break;

				default :
					break loop21;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
			     context.currentStorageService.createStorageObject();
			     context.currentStorageService.generateStorageCode(); 
			     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ss_def"



	// $ANTLR start "storageDataAccess_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:150:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:150:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:151:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
			pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def628);
			storageGeneratedInfo_def();
			state._fsp--;

			match(input,17,FOLLOW_17_in_storageDataAccess_def631); 
			pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def633);
			storagedataIndex_def();
			state._fsp--;

			 context.currentStorageService.addDataAccess(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "storageDataAccess_def"



	// $ANTLR start "storageGeneratedInfo_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:155:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID17=null;
		ParserRuleReturnScope lc_id18 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:155:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:156:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_storageGeneratedInfo_def652); 
			pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def654);
			lc_id18=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageGeneratedInfo_def656); 
			CAPITALIZED_ID17=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def659); 

			     context.constructStorageSymblTable((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
			     context.currentStorageService.addGeneratedInfo((lc_id18!=null?input.toString(lc_id18.start,lc_id18.stop):null), (CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));  
			      context.constructSymbTable((lc_id18!=null?input.toString(lc_id18.start,lc_id18.stop):null), (CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
			    context.constructResponseTypeSymblTable((lc_id18!=null?input.toString(lc_id18.start,lc_id18.stop):null), (CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
			   
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "storageGeneratedInfo_def"



	// $ANTLR start "storagedataIndex_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:166:1: storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id19 =null;
		ParserRuleReturnScope dataType20 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:166:21: ( lc_id ':' dataType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:167:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_storagedataIndex_def681);
			lc_id19=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storagedataIndex_def683); 
			pushFollow(FOLLOW_dataType_in_storagedataIndex_def685);
			dataType20=dataType();
			state._fsp--;

			 context.currentStorageService.addDataAccessIndex((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (dataType20!=null?input.toString(dataType20.start,dataType20.stop):null)); 
			        context.constructStorageInfoSymblTable((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (dataType20!=null?input.toString(dataType20.start,dataType20.stop):null));
			        
			         
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "storagedataIndex_def"


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:174:1: lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:174:6: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:174:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id703); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lc_id"


	public static class dataType_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "dataType"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:177:1: dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:177:9: ( primitiveType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:178:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType716);
			primitiveType();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dataType"



	// $ANTLR start "primitiveType"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:181:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:181:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			int alt22=7;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt22=1;
				}
				break;
			case 13:
				{
				alt22=2;
				}
				break;
			case 15:
				{
				alt22=3;
				}
				break;
			case 21:
				{
				alt22=4;
				}
				break;
			case 25:
				{
				alt22=5;
				}
				break;
			case 20:
				{
				alt22=6;
				}
				break;
			case 16:
				{
				alt22=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType731); 
					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType737); 
					}
					break;
				case 3 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType743); 
					}
					break;
				case 4 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:49: id= 'double'
					{
					id=(Token)match(input,21,FOLLOW_21_in_primitiveType752); 
					}
					break;
				case 5 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:65: id= 'long'
					{
					id=(Token)match(input,25,FOLLOW_25_in_primitiveType760); 
					}
					break;
				case 6 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType766); 
					}
					break;
				case 7 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:182:92: id= '_'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType771); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primitiveType"

	// Delegated rules



	public static final BitSet FOLLOW_33_in_vocabSpec75 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec77 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_vocabSpec80 = new BitSet(new long[]{0x0000000020000010L});
	public static final BitSet FOLLOW_29_in_vocabSpec90 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec92 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def112 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_structField_def_in_struct_def126 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def128 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def151 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def153 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_structField_def155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_abilities_def180 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def182 = new BitSet(new long[]{0x0000000190480000L});
	public static final BitSet FOLLOW_sensor_def_in_abilities_def186 = new BitSet(new long[]{0x0000000180080002L});
	public static final BitSet FOLLOW_19_in_abilities_def194 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def196 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actuator_def_in_abilities_def198 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_32_in_abilities_def205 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def208 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ss_def_in_abilities_def210 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_28_in_sensor_def233 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def235 = new BitSet(new long[]{0x0000000010400012L});
	public static final BitSet FOLLOW_periodicsensor_def_in_sensor_def237 = new BitSet(new long[]{0x0000000010400012L});
	public static final BitSet FOLLOW_22_in_sensor_def250 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def252 = new BitSet(new long[]{0x0000000000400012L});
	public static final BitSet FOLLOW_eventsensor_def_in_sensor_def255 = new BitSet(new long[]{0x0000000000400012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_periodicsensor_def269 = new BitSet(new long[]{0x0000000041000002L});
	public static final BitSet FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def282 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def284 = new BitSet(new long[]{0x0000000041000002L});
	public static final BitSet FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def294 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def296 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_eventsensor_def313 = new BitSet(new long[]{0x0000000005001002L});
	public static final BitSet FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def326 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def328 = new BitSet(new long[]{0x0000000005001002L});
	public static final BitSet FOLLOW_sensoreventMeasurement_def_in_eventsensor_def338 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def340 = new BitSet(new long[]{0x0000000004001002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForEventDriven_def357 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def359 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForEventDriven_def361 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForPeriodic_def387 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def389 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForPeriodic_def391 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_sensorperiodicMeasurement_def419 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_sensorperiodicMeasurement_def421 = new BitSet(new long[]{0x0000000000800040L});
	public static final BitSet FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def424 = new BitSet(new long[]{0x0000000000800040L});
	public static final BitSet FOLLOW_23_in_sensorperiodicMeasurement_def428 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def431 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_INT_in_sample_period_def446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sample_duration_def459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_sensoreventMeasurement_def471 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def474 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_10_in_sensoreventMeasurement_def477 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def479 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def494 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_action_def_in_actuator_def506 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_actuator_def508 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_action_def530 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def532 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_action_def534 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_parameter_def_in_action_def537 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_action_def541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_parameter_def561 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parameter_def563 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def566 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_parameter_def569 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_def_in_parameter_def571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def589 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def602 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def604 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def628 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_storageDataAccess_def631 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_storageGeneratedInfo_def652 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def654 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def656 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def681 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storagedataIndex_def683 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primitiveType752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_primitiveType760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType771 = new BitSet(new long[]{0x0000000000000002L});
}
