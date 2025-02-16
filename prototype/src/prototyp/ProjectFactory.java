package prototyp;

public class ProjectFactory {
    Project project;

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject(){
        return (Project) project.copy();
    }
    
}
