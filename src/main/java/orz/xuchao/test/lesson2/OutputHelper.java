package orz.xuchao.test.lesson2;

public class OutputHelper
{
	IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
//	set依赖注入的时候必须有
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
	
//	构造注入的时候必须有
	OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
	
}
