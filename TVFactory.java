public interface TVFactory{
public TV produceTV();}
public class HaierTVFactory implements TVFactory{
public TV produceTV(){
return new HaierTV();
}}
public class HisenseTVFactory implements TVFactory{
public TV produceTV(){
return new HisenseTV();
}}