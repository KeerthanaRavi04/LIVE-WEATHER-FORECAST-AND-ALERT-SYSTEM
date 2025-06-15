@Entity
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String facultyId;
    private String name;
    private String role; // COE, BoardChairman, ChiefExaminer, etc.
    
    @ManyToOne
    private Department department;
    
    // Getters and Setters
}
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "department")
    private List<Faculty> facultyList;
    
    // Getters and Setters
}
