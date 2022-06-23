package se.lexicon.rajashree.jpaassignment2.Entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class RecipeInstruction {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String instructions;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "receipe_id", referencedColumnName = "id")
    // foreign key (address_id) references address(id)
    private Recipe recipe;



    public RecipeInstruction() {
    }

    public RecipeInstruction(String instructions) {
        this.instructions = instructions;
    }

    public RecipeInstruction(int id, String instructions) {
        this.id = id;
        this.instructions = instructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id=" + id +
                ", instructions='" + instructions + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeInstruction)) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return getId() == that.getId() && getInstructions().equals(that.getInstructions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInstructions());
    }
}
