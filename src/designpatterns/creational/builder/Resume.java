package designpatterns.creational.builder;

public class Resume {
    //required params
    private int id;
    private String name;
    private String qualification;
    private long mobileNo;
    private String address;
    //optional params
    private int experience;
    private String project;
    private String preCompany;

    public Resume(ResumeBuilder resumeBuilder) {
        this.id = resumeBuilder.id;
        this.name = resumeBuilder.name;
        this.qualification = resumeBuilder.qualification;
        this.mobileNo = resumeBuilder.mobileNo;
        this.address = resumeBuilder.address;
        this.experience = resumeBuilder.experience;
        this.project = resumeBuilder.project;
        this.preCompany = resumeBuilder.preCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPreCompany() {
        return preCompany;
    }

    public void setPreCompany(String preCompany) {
        this.preCompany = preCompany;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", mobileNo=" + mobileNo +
                ", address='" + address + '\'' +
                ", experience=" + experience +
                ", project='" + project + '\'' +
                ", preCompany='" + preCompany + '\'' +
                '}';
    }

    public static class ResumeBuilder{
        //required params
        private int id;
        private String name;
        private String qualification;
        private long mobileNo;
        private String address;
        //optional params
        private int experience;
        private String project;
        private String preCompany;

        public ResumeBuilder(int id, String name, String qualification, long mobileNo, String address) {
            this.id = id;
            this.name = name;
            this.qualification = qualification;
            this.mobileNo = mobileNo;
            this.address = address;
        }
        public ResumeBuilder setExperience(int experience)
        {
            this.experience=experience;
            return this;
        }
        public ResumeBuilder setProject(String project)
        {
            this.project=project;
            return this;
        }
        public ResumeBuilder setPreCompany(String preCompany)
        {
            this.preCompany=preCompany;
            return this;
        }

        public Resume build()
        {
            return new Resume(this);
        }
    }
}
