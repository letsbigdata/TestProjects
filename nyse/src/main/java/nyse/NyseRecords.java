package nyse;

//import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class NyseRecords extends Configured implements Tool {

	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Job job = Job.getInstance(getConf());
		
		FileInputFormat.setInputPaths(job, new Path("/home/aditya/testdata/deckofcards/deckofcards.txt"));
		FileOutputFormat.setOutputPath(job, new Path("/home/aditya/testdata/deckofcards/deckofcardsoutput"));
		
		return job.waitForCompletion(true ) ? 0 : 1; 
		
	}
	
	public static void main(String args[]) throws Exception{
		
		System.exit(ToolRunner.run(new NyseRecords(), args));
	}
	
}
