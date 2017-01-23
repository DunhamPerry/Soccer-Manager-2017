
public class TeamPlayer
	{
		private String firstName;
		private String lastName;
		private int position;
		private int overall;
		private int pace;
		private int shooting;
		private int passing;
		private int dribbling;
		private int defending;
		private int physical;

		public TeamPlayer(String fn, String ln, int po, int ov, int pc, int sh, int ps, int dr, int df, int ph){
			firstName = fn;
			lastName = ln;
			position = po;
			overall = ov;
			pace = pc;
			shooting = sh;
			passing = ps;
			dribbling = dr;
			defending = df;
			physical = ph;
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		
		public int getPosition()
			{
				return position;
			}

		public void setPosition(int position)
			{
				this.position = position;
			}
		
		
		public int getOverall()
			{
				return overall;
			}

		public void setOverall(int overall)
			{
				this.overall = overall;
			}

		public int getPace()
			{
				return pace;
			}

		public void setPace(int pace)
			{
				this.pace = pace;
			}

		public int getShooting()
			{
				return shooting;
			}

		public void setShooting(int shooting)
			{
				this.shooting = shooting;
			}

		public int getPassing()
			{
				return passing;
			}

		public void setPassing(int passing)
			{
				this.passing = passing;
			}

		public int getDribbling()
			{
				return dribbling;
			}

		public void setDribbling(int dribbling)
			{
				this.dribbling = dribbling;
			}

		public int getDefending()
			{
				return defending;
			}

		public void setDefending(int defending)
			{
				this.defending = defending;
			}

		public int getPhysical()
			{
				return physical;
			}

		public void setPhysical(int physical)
			{
				this.physical = physical;
			}

	}
