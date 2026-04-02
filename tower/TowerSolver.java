package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        //call overloaded solve method here
        solve(model.getHeight(), 0, 2, 1);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    public void solve(int height, int source, int destination, int intermediate){
        //model.print();
        if(height==1){
            model.move(source, destination);
        }else{
            solve(height-1, source, intermediate, destination);
            model.print();
            model.move(source, destination);
            model.print();
            solve(height-1, intermediate, destination, source);
            model.print();
        }
    }

}