class Semester {
    int semId;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int practical1;
    int practical2;

    public Semester(int semId, int sub1, int sub2, int sub3, int sub4, int practical1, int practical2) {
        this.semId = semId;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.practical1 = practical1;
        this.practical2 = practical2;
    }

    public int getSemId() {
        return semId;
    }

    public int getPractical1() {
        return practical1;
    }

    public int getPractical2() {
        return practical2;
    }

    @Override
    public String toString() {
        return "Semester [semId=" + semId + ", practical1=" + practical1 + ", practical2=" + practical2 + "]";
    }
}