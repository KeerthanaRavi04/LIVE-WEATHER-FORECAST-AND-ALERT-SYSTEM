public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Optional<Faculty> findByFacultyId(String facultyId);
}
