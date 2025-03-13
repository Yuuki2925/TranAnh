class Classroom {
    private String classId;
    private String className;
    private String teacherId;

    public Classroom(String classId, String className, String teacherId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }
}
