import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class VectorHeapTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(VectorHeap.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        
    }

    @org.junit.Test
    public boolean add() {
        VectorHeap<String> vh = new VectorHeap<>();
        vh.add("Prueba");
        if(vh.isEmpty()){
            return false;
        }
        return true;
    }

    @org.junit.Test
    public boolean remove() {
        VectorHeap<String> vh = new VectorHeap<>();
        vh.add("Prueba");
        vh.remove();
        if(!vh.isEmpty()){
            return false;
        }
        return true;
    }
}
