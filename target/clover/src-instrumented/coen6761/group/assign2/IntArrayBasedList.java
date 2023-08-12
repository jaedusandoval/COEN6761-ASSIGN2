/* $$ This file has been instrumented by Clover 4.4.0#2019092621413129 $$ */package coen6761.group.assign2;

public class IntArrayBasedList implements IntList {public static class __CLR4_4_000lkvyivi2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_0();if(2019092621413129L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.0#2019092621413129,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0043\u006f\u0064\u0065\u005c\u005c\u0063\u006f\u0065\u006e\u0036\u0037\u0036\u0031\u005c\u005c\u0061\u0073\u0073\u0069\u0067\u006e\u0032\u005c\u005c\u0061\u0073\u0073\u0069\u0067\u006e\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691115531662L,8589935092L,25,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	int max_size = 10; 
	int INITIAL_VALUE = -60233; 

	Integer[] datastorage; 
	
	
	public IntArrayBasedList() {try{__CLR4_4_000lkvyivi2.R.inc(0);
		__CLR4_4_000lkvyivi2.R.inc(1);datastorage = new Integer[max_size]; 
		
		__CLR4_4_000lkvyivi2.R.inc(2);for(int i=0;(((i<max_size)&&(__CLR4_4_000lkvyivi2.R.iget(3)!=0|true))||(__CLR4_4_000lkvyivi2.R.iget(4)==0&false));i++) {{
			__CLR4_4_000lkvyivi2.R.inc(5);datastorage[i] = INITIAL_VALUE;
		}
		
	}}finally{__CLR4_4_000lkvyivi2.R.flushNeeded();}}
	
	
	public boolean insert(int pos, int value) {try{__CLR4_4_000lkvyivi2.R.inc(6);
		
//		assert (pos<1000 && pos>=0) : "the position out of the range";
		
		__CLR4_4_000lkvyivi2.R.inc(7);if((((pos<1000 && pos>=0)&&(__CLR4_4_000lkvyivi2.R.iget(8)!=0|true))||(__CLR4_4_000lkvyivi2.R.iget(9)==0&false))) {{
			 __CLR4_4_000lkvyivi2.R.inc(10);if((((find(pos))&&(__CLR4_4_000lkvyivi2.R.iget(11)!=0|true))||(__CLR4_4_000lkvyivi2.R.iget(12)==0&false))) // already exist
				{__CLR4_4_000lkvyivi2.R.inc(13);return false; 
			}__CLR4_4_000lkvyivi2.R.inc(14);datastorage[pos] = value; 
			__CLR4_4_000lkvyivi2.R.inc(15);return true; 
			
		}
		
		}__CLR4_4_000lkvyivi2.R.inc(16);return false; // out of range
	}finally{__CLR4_4_000lkvyivi2.R.flushNeeded();}}
	
	public boolean find(int pos) {try{__CLR4_4_000lkvyivi2.R.inc(17);
		__CLR4_4_000lkvyivi2.R.inc(18);if((((datastorage[pos]!=INITIAL_VALUE)&&(__CLR4_4_000lkvyivi2.R.iget(19)!=0|true))||(__CLR4_4_000lkvyivi2.R.iget(20)==0&false)))
			{__CLR4_4_000lkvyivi2.R.inc(21);return true;
		}__CLR4_4_000lkvyivi2.R.inc(22);return false; 
	}finally{__CLR4_4_000lkvyivi2.R.flushNeeded();}}
	
	public boolean remove(int pos) {try{__CLR4_4_000lkvyivi2.R.inc(23);
		__CLR4_4_000lkvyivi2.R.inc(24);return false; 
	}finally{__CLR4_4_000lkvyivi2.R.flushNeeded();}}

}
