package sudas.study.example.zero;

public class UsingInterface implements TestInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getinfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getname() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setinfo(String info) {
		// TODO Auto-generated method stub
		
	}

}

class CreateObjectOfAnInterface
{
	TestInterface interf = new TestInterface() {
		
		@Override
		public void setname(String name) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setinfo(String info) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getname() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void getinfo() {
			// TODO Auto-generated method stub
			
		}
	};
}

