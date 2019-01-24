/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
class courses {
	String cno;
	int crh;
	int grade;
	courses(String cno){
		this.cno=cno;
	}
	protected void finalize () {	
	}
public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getCrh() {
		return crh;
	}
	public void setCrh(int crh) {
		this.crh = crh;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}

class Student {
private String day,month,year,name,id,major,birthdate;
private ArrayList<courses> array= new ArrayList<courses>(); 
Student(String id){
this.id=id;	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public String getBirthdate() {
	return birthdate;
}
public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}
public ArrayList<courses> getArray() {
	return array;
}
public void setArray(ArrayList<courses> array) {
	this.array = array;
}
public courses getcou(Student obj,String cno) {
	courses q=null;
	for(courses a:obj.array) {
		if(a.getCno().equals(cno)){
			q=a;break;}
	}
	return q;
}
public void setcourse(Student obj,String cno,String att,int value ) {
	courses objc=obj.getcou(obj, cno);
	if(objc==null){return;}
	if(att.equals("crh")) {
		objc.setCrh(value);
	}
	else if(att.equals("grade")){
		objc.setGrade(value);
	}
	else System.out.println("Sorry, this attribute is invalid !");
  
  }
	

public double getaverage(Student obj) {
int sum=0,co=obj.array.size();
int sum1=0;
double a=0.0d;
	for(courses q: obj.array) {
	 sum+=(q.getCrh())*(q.getGrade());
	 sum1+=q.getCrh();
}
	if (co==0) {
		System.out.println("Sorry, There is no course for this student !");
	    return a;
	}
	else { 
		return a=(double)sum/sum1;
	}
 }
public void print(Student obj) {
	System.out.println("This is student information :");
	System.out.println("______________________________");
System.out.println(" ID: "+obj.getId()+"\n Name: "+obj.getName()+"\n Major: "+ obj.getMajor()+"\n Birthdate :"+ obj.getBirthdate());
System.out.println("avg :"+obj.getaverage(obj));
System.out.println("\n\nThis information is about courses:");
System.out.println("=============================");
System.out.println("Cno"+"\t"+"Credit Hours" +"\t"+"Grade" );
System.out.println("=============================");
if(obj.array.size()==0) {
System.out.println("NO Result To Show ");
System.out.println("\n\n"+"=============================");
}
else {
	int co=obj.array.size(),i=0;
   while(i<co) {		
     System.out.println(this.getArray().get(i).getCno()+"\t"+this.getArray().get(i).getCrh()+"\t"+this.getArray().get(i).getGrade());
      i++;
    }
  System.out.println("=============================");
  }
}
	public  Student getstu(String ID, ArrayList<Student> arr) {
 		Student index=null;
 		for(Student a: arr) 
 			if(a.getId().equals(ID))
 				index=a;
 		return index;
	}
	protected void finalize () {	
	}
}

/**
 * @author Laptop Center
 *
 */
public class Gui extends JFrame implements ActionListener {
	ArrayList<Student> arr=new ArrayList<Student>();

	JFrame frame;
	//ADD STU
	JLabel label1;
JButton button1;
JFrame frame1;
JTextField idtext1;
JButton idbutton1;
JButton closebutton1;
JLabel idlabel1;
//DELETE STU
JLabel label2;
JButton button2;
JFrame frame2;
JTextField idtext2;
JButton idbutton2;
JButton closebutton2;
JLabel idlabel2;
//SET 
JLabel label3;
JButton button3;
//GET
JLabel label4;
JButton button4;
//ADDCOURSE 
JLabel label5;
JButton button5;
//SETCOURSE
JLabel label6;
JButton button6;
//GETAVG
JLabel label7;
JButton button7;
//PRINT INFORMATION
JLabel label8;
JButton button8;
//EXIT
JLabel label9;
JButton button9;

 JFrame frame3;

 JLabel idlabel3;

 JTextField idtext3;

 JButton idbutton3;

 JButton closebutton3;

 JFrame frame4;
 JTextField text1;

 JTextField text2;

 JTextField text3;

 JTextField text4;

 JComboBox<?> combobox1;

 JComboBox<?> combobox2;
 JPanel panel1;

 JPanel panel2;

 JPanel panel3;

 JFrame frame5;

 JTextField idtext5;

 JLabel idlabel5;

 JButton idbutton5;

 JButton closebutton5;

 JButton idbutton8;

 JButton bbutton;

 JButton closingbutton;

 JPanel panel;

 String day[]= {"1","2","3","4","5","6","7","8","9","10"
		,"11","12","13","14","15","16","17","18","19","20","21","22"
		,"23","24","25","26","27","28","29","30","31"};
 String month[]= {"01","02","03","04","05","06","07"
		,"08","09","10","11","12"};

 JFrame frame11;

 Component closebutton8;
 JButton addbutton5;
 JButton closebutton9;

 JTextField coursetext;
 JLabel courseid;
 JFrame frame6;
 JLabel idlabe;
 JTextField idtex;
 JButton getbutton4;
 JButton closebutton4;
 JRadioButton nradio;

 JRadioButton mradio;

 JRadioButton bradio;
 JFrame frame7;

 JButton pbutt;
 JButton cpbutt;

 JPanel panelp;
 JTextField texty;
 JTextField idtex1;
 JTextField idtex2;
 JTextField idtex3;
 JButton nbutt;
 JButton bbutt;
 JLabel l;
 JFrame frame8;
 JLabel id;
 JTextField txt;
 JButton closebutton7;
 JButton Abut;
 JFrame frame9;
 JTextField txt9;
 JLabel id9;
 JButton closebutton6;
 JLabel bale1;
 JLabel bale2;
 JLabel bale3;
 JLabel bale4;
 JTextField xt1;
 JTextField xt2;
 JTextField xt3;
 JTextField xt4;
 JButton but;
 JPanel pan;
 JPanel pan1;

private JTextArea textarea;

private JScrollPane scrolpanel;

private JPanel pppp;

Gui(){
	frame=new JFrame("menu main");
	label1 = new JLabel(" Add Student");
	label2 = new JLabel(" Delete Student");
	label3 = new JLabel(" Set To Information");
	label4 = new JLabel(" Student Information");
	label5 = new JLabel(" Add Course");
	label6 = new JLabel(" Set Course");
	label7 = new JLabel(" Get Average");
	label8 = new JLabel("Print Information");
	label9 = new JLabel(" Close Programe");
	button1 = new JButton("press here");	
	button2 = new JButton("press here");
	button3 = new JButton("press here");
	button4 = new JButton("press here");
	button5 = new JButton("press here");
	button6 = new JButton("press here");
	button7 = new JButton("press here");
	button8 = new JButton("press here");
	button9 = new JButton("press here");
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(500,600);
		this.setResizable(false);
 		this.setLocationRelativeTo(null);//center of the  screen
 		//Color f=new Color(205,171,33);
 		//this.setBackground(f);
 		this.setLayout(new GridLayout(9,2));
	this.add(label1);
this.add(button1);
this.add(label2);
this.add(button2);
this.add(label3);
this.add(button3);
this.add(label4);
this.add(button4);
this.add(label5);
this.add(button5);
this.add(label6);
this.add(button6);
this.add(label7);
this.add(button7);
this.add(label8);
this.add(button8);
this.add(label9);
this.add(button9);
Color c=new Color(245,222,179);
button1.setBackground(c);
button2.setBackground(c);
button3.setBackground(c);
button4.setBackground(c);
button5.setBackground(c);
button6.setBackground(c);
button7.setBackground(c);
button8.setBackground(c);
button9.setBackground(c);
button1.addActionListener(this);
button2.addActionListener(this);
button1.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);

}
public boolean valid(char r[])  {
	boolean re=true;
	for(char q:r) {
		if(!(q>='0'&&q<='9')) {
			return false;
		}
	}
	return re;
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==button1) {
	frame1 = new JFrame("Add Student");
	frame1.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame1.setVisible(true);
	frame1.setResizable(false);
	frame1.setLocationRelativeTo(null);
	idlabel1=new JLabel("Enter id");
	idtext1 = new JTextField();
	idtext1.setSize(100, 30);
	idbutton1 = new JButton("add this student");
    closebutton1= new JButton("Re-Menu");
    frame1.setLayout(new GridLayout(6, 8));
    frame1.add(idlabel1);
    frame1.add(idtext1);
    frame1.add(idbutton1);
    frame1.add(closebutton1);
    idbutton1.addActionListener(this);
    closebutton1.addActionListener(this);
}
else if (e.getSource()==idbutton1) {
	String s = idtext1.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null,"please enter your id before clicked");
	}
	else {
	char[]r=s.toCharArray();
	  if(!valid(r)) {
		JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
	  }
	  else {
		  Student a=new Student(s);
			if(a.getstu(s,arr)==null) {
	           arr.add(a);
	           JOptionPane.showMessageDialog(null, "Student has been added");
               }
              else {
	           JOptionPane.showMessageDialog(null, "Sorry ,this id is exist !");
              }
	  }
	}
}
else if(e.getSource()==closebutton1) {
	 frame1.setVisible(false);
}
else if(e.getSource()==button2) {
	frame2= new JFrame("DELETE STUDENT");
	frame2.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame2.setVisible(true);
	frame2.setResizable(false);
	frame2.setLocationRelativeTo(null);
	idlabel2=new JLabel("Enter id");
	idtext2 = new JTextField();
	idtext2.setSize(100, 30);
	idbutton2 = new JButton("delete ");
    closebutton2= new JButton("Re-Menu");
    frame2.setLayout(new GridLayout(6, 8));
    frame2.add(idlabel2);
    frame2.add(idtext2);
    frame2.add(idbutton2);
    frame2.add(closebutton2);
    idbutton2.addActionListener(this);
    closebutton2.addActionListener(this);
}
else if (e.getSource()==idbutton2) {
	String s= idtext2.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter your id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
	}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
			}
			else
				JOptionPane.showMessageDialog(null, "Successfully deleted *_* ");
				arr.remove(f.getstu(s,arr));
		}
}
}
else if (e.getSource()==closebutton2) {
	frame2.setVisible(false);
}
else if(e.getSource()==button3) {
	frame3 = new JFrame("Set To Information");
	frame3.setSize(400,300);
	frame3.setVisible(true);
	frame3.setResizable(false);
	frame3.setLocationRelativeTo(null);
	idlabel3=new JLabel("Enter id");
	idtext3 = new JTextField();
	idtext3.setSize(100, 30);
	idbutton3 = new JButton("SET");
    closebutton3= new JButton("Re-Menu");

	label1=new JLabel("ID:");
	label2=new JLabel("Name : ");
	label3=new JLabel("Major : ");
	label4=new JLabel("  day ");
	label6=new JLabel("  month ");

	text1=new JTextField();
	text1.setEditable(false);
	text1.setSize(100, 30);

	text2=new JTextField();
	text2.setEditable(true);
	text2.setSize(100, 30);

	text3=new JTextField();	
	text3.setEditable(true);
	text3.setSize(100, 30);

	label5=new JLabel("Year : ");
	text4=new JTextField();	
	text4.setEditable(true);
	text4.setSize(100, 30);
	combobox1=new JComboBox<String>(day);
	combobox1.setMaximumRowCount(7);
	combobox2=new JComboBox<String>(month);
	combobox2.setMaximumRowCount(7);

	combobox1.addItemListener(
			new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange()==ItemEvent.SELECTED)
						JOptionPane.showMessageDialog(null, "you have selected item"+combobox1.getSelectedIndex());
				}
			}
			
			);

	combobox2.addItemListener(
			new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange()==ItemEvent.SELECTED)
						JOptionPane.showMessageDialog(null, "you have selected item"+combobox2.getSelectedIndex());

				}
			}
			);
    frame3.setLayout(new GridLayout(8,2,5,5));
    frame3.add(idlabel3);
    frame3.add(idtext3);
    frame3.add(idbutton3);
    frame3.add(closebutton3);
    frame3.add(label1);
    frame3.add(text1);
    frame3.add(label2);
    frame3.add(text2);
    frame3.add(label3);
    frame3.add(text3);
    frame3.add(label5);
    frame3.add(text4);
    frame3.add(label4);
    frame3.add(label6);
    frame3.add(combobox1);
    frame3.add(combobox2);
    idbutton3.addActionListener(this);
    closebutton3.addActionListener(this);

	
}

else if (e.getSource()==idbutton3) {
	String s= idtext3.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter your id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			    else {
					text1.setText(f.getId());
			 		for(Student a: arr) 
			 			if(a.getId().equals(s)) {
						 	a.setName(text2.getText());
							a.setMajor(text3.getText());
							if(!valid(text4.getText().toCharArray())){
								JOptionPane.showMessageDialog(null, "get a logic year !");

							}
							else {
							a.setBirthdate(day[combobox1.getSelectedIndex()]+"/"+month[combobox2.getSelectedIndex()]+"/"+text4.getText());
							}
			 			}
			}
		}
	}
}

else if (e.getSource()==closebutton3) {
	frame3.setVisible(false);
}
else if(e.getSource()==button4) {

	frame6 = new JFrame("get student infromation");
	frame6.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame6.setVisible(true);
	frame6.setResizable(false);
	frame6.setLocationRelativeTo(null);

	idlabe=new JLabel("Enter id");
	idtex = new JTextField();
	idtex.setSize(50, 15);
	nbutt=new JButton("Name");
	getbutton4 = new JButton("major");
	bbutt=new JButton("birthdate");
    closebutton4= new JButton("Re-Menu");
    panel=new JPanel();
    panel.setLayout(new FlowLayout());
    panel1=new JPanel();
    panel1.setLayout(new GridLayout(1,2));
    frame6.setLayout(new BorderLayout());
    panel1.add(idlabe);
    panel1.add(idtex);
    frame6.add(panel1,BorderLayout.NORTH);
    panel.add(nbutt);
    panel.add(getbutton4);
    panel.add(bbutt);
    panel.add(closebutton4);
    frame6.add(panel,BorderLayout.CENTER);
    nbutt.addActionListener(this);
    bbutt.addActionListener(this);
    getbutton4.addActionListener(this);
    closebutton4.addActionListener(this);
}

else if (e.getSource()==nbutt) {

	String s= idtex.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter an id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			else {
		 		for(Student a: arr) 
		 			if(a.getId().equals(s)) {
				JOptionPane.showMessageDialog(null, "Name is "+a.getName());
		 			}

			}
		}
	}
}

else if (e.getSource()==getbutton4) {

	String s= idtex.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter an id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			else {
		 		for(Student a: arr) 
		 			if(a.getId().equals(s)) {
				JOptionPane.showMessageDialog(null, "Major is"+a.getMajor());
		 			}
			}
		}
	}
}

else if (e.getSource()==bbutt) {

	String s= idtex.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter an id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			else {
		 		for(Student a: arr) 
		 			if(a.getId().equals(s)) {
				JOptionPane.showMessageDialog(null, "birthdate is "+a.getBirthdate());
		 			}
			}
		}
	}
}


else if (e.getSource()==closebutton4) {
	frame6.setVisible(false);
}
else if(e.getSource()==button5) {

	frame4 = new JFrame("addCourse");
	frame4.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame4.setVisible(true);
	frame4.setResizable(false);
	frame4.setLocationRelativeTo(null);

	idlabel1=new JLabel("Enter id");
	idtext1 = new JTextField();
	idtext1.setSize(50, 30);
	courseid=new JLabel("Enter course id");
	coursetext=new JTextField();
	coursetext.setSize(50,30);
	addbutton5 = new JButton("addCourse");
    closebutton5= new JButton("Re-Menu");
    
    frame4.setLayout(new GridLayout(3,2,5,5));
    frame4.add(idlabel1);
    frame4.add(idtext1);
    frame4.add(courseid);
    frame4.add(coursetext);
    frame4.add(addbutton5);
    frame4.add(closebutton5);
    addbutton5.addActionListener(this);
    closebutton5.addActionListener(this);
}
else if (e.getSource()==addbutton5) {

	String s= idtext1.getText();
	String m= coursetext.getText();

	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter your id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			else {

				if(m.length()==0) {
					JOptionPane.showMessageDialog(null, "please enter an id for your course");
				}
				else {
					if(!valid(m.toCharArray())) {
						JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
					}
					else {
						courses d = new courses(m);
							if(f.getcou(f,m)==null) {
						 		for(Student a: arr) {
						 			if(a.getId().equals(s)) {
						             a.getArray().add(d);
						           JOptionPane.showMessageDialog(null, "Course has been added");
						 			}
						
					         	
						 		}
						}
					}
				}
			}
		}
	}
}
else if (e.getSource()==closebutton5) {
	frame4.setVisible(false);
}
else if(e.getSource()==button6) {
	frame9 = new JFrame("Set Course");
	frame9.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame9.setVisible(true);
	frame9.setResizable(false);
	frame9.setLocationRelativeTo(null);
	id9=new JLabel("Enter id");
	txt9 = new JTextField();
	txt9.setSize(100, 15);
	but = new JButton("set course");
    closebutton6= new JButton("Re-Menu");
    bale1=new JLabel("course id");
	xt1 = new JTextField();
	xt1.setSize(100, 15);
	xt1.setEditable(true);
    bale2=new JLabel("Creidt Hour");
	xt2 = new JTextField();
	xt2.setSize(100, 15);
	xt2.setEditable(true);

    bale3=new JLabel("Grade");
	xt3 = new JTextField();
	xt3.setSize(100, 15);
	xt3.setEditable(true);

	pan=new JPanel();
	pan.setLayout(new GridLayout(2,2,5,5));
	pan1=new JPanel();
	pan1.setLayout(new GridLayout(3,2,5,5));
	pan1.add(id9);
	pan1.add(txt9);
	pan1.add(bale1);
	pan1.add(xt1);
	pan1.add(but);
	pan1.add(closebutton6);
	pan.add(bale2);
	pan.add(xt2);
	pan.add(bale3);
	pan.add(xt3);
	frame9.setLayout(new BorderLayout());
	frame9.add(pan1,BorderLayout.NORTH);
	frame9.add(pan,BorderLayout.CENTER);

    but.addActionListener(this);
    closebutton6.addActionListener(this);
}

else if (e.getSource()==but) {

	String s= txt9.getText();
	String r= xt1.getText();

	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter an id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			   else {
				  if(r.length()==0) {
					JOptionPane.showMessageDialog(null, "please enter an id for your course");
				}
				  else {
					if(!valid(r.toCharArray())) {
						JOptionPane.showMessageDialog(null, "Sorry,this course id is invalid !");
					}
					else {
						courses q = new courses(r);
				 		for(Student a: arr) 
				 			if(a.getId().equals(s)) { 

				 				for(courses c:a.getArray()) {
				 					if(c.getCno().equals(r)){
				 				int val=Integer.parseInt(xt2.getText());
				 				int val1=Integer.parseInt( xt3.getText());
			 				a.setcourse(a, r, "crh",val );
					 		a.setcourse(a, r, "grade",val1);
							JOptionPane.showMessageDialog(null, "course has been setted");	
					}
				 					else 	JOptionPane.showMessageDialog(null, "this course id is not exist !");	


						    }
				 		}
					}
				  }
			   }
		}
	}
}
	


else if (e.getSource()==closebutton6) {
	frame9.setVisible(false);
}
else if(e.getSource()==button7) {
	frame8 = new JFrame("average");
	frame8.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame8.setVisible(true);
	frame8.setResizable(false);
	frame8.setLocationRelativeTo(null);
	id=new JLabel("Enter id");
	pppp=new JPanel();
	pppp.setLayout(new GridLayout(2,2,5,5));
	txt = new JTextField();
	txt.setSize(100, 15);
	Abut = new JButton("get avg");
    closebutton7= new JButton("Re-Menu");
    frame8.setLayout(new FlowLayout());
    pppp.add(id);
    pppp.add(txt);
    pppp.add(Abut);
    pppp.add(closebutton7);
    frame8.add(pppp);
    Abut.addActionListener(this);
    closebutton7.addActionListener(this);

    
}

else if (e.getSource()==Abut) {

	String s= txt.getText();
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter an id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			else {
		 		for(Student a: arr) 
		 			if(a.getId().equals(s)) {
				JOptionPane.showMessageDialog(null, "the avg is = "+a.getaverage(a));
		 			}

			}
		}
	}
}
else if(e.getSource()==button8) {
	frame5 = new JFrame("Print");
	frame5.setSize(400,300);
	//frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame5.setVisible(true);
	frame5.setResizable(false);
	frame5.setLocationRelativeTo(null);
	idlabel5=new JLabel("Enter id");
	idtext5 = new JTextField();
	idtext5.setSize(100, 15);
	idbutton8 = new JButton("Print");
    closebutton9= new JButton("Re-Menu");
    frame5.setLayout(new GridLayout(2,2,5,5));
    frame5.add(idlabel5);
    frame5.add(idtext5);
    frame5.add(idbutton8);
    frame5.add(closebutton9);
    idbutton8.addActionListener(this);
    closebutton9.addActionListener(this);

	
}

else if (e.getSource()==idbutton8) {

	String s= idtext5.getText();
	frame7 = new JFrame("Print");
	frame7.setSize(1000,500);
	frame7.setVisible(true);
	frame7.setResizable(false);
	frame7.setLocationRelativeTo(null);
	l=new JLabel("student");
	textarea=new JTextArea();
	textarea.setEditable(false);
	textarea.setSize(600, 200);
	scrolpanel=new JScrollPane(textarea);
	texty = new JTextField();
	texty.setSize(300, 200);
	cpbutt=new JButton("re-menu");
	panelp=new JPanel();
	frame7.setLayout(new BorderLayout());
	frame7.add(textarea,BorderLayout.CENTER);
	frame7.add(cpbutt,BorderLayout.SOUTH);
	cpbutt.addActionListener(this);
    
	if(s.length()==0) {
		JOptionPane.showMessageDialog(null, "please enter your id before clicked");
	}
	else {
		if(!valid(s.toCharArray())) {
			JOptionPane.showMessageDialog(null, "Sorry,this id is invalid !");
		}
		else {
			Student f = new Student(s);
				if(f.getstu(s,arr)==null) {
				JOptionPane.showMessageDialog(null, "Sorry,this id is not exist !");
			}
			else {
		 		for(Student a: arr) 
		 			if(a.getId().equals(s)) {
		 				a.print(a);
		 			}
			
			}
		}
	}
}
else if (e.getSource()==closebutton7) {
	frame8.setVisible(false);
}
else if (e.getSource()==cpbutt) {
	frame7.setVisible(false);
}
else if (e.getSource()==closebutton9) {
	frame5.setVisible(false);
}
else if(e.getSource()==button9) {
	JOptionPane.showMessageDialog(null, "GOODBYE");
	System.exit(0);
}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Gui play=new Gui();
	}

}
