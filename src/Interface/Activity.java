package Interface;


/**
 * 活動介面
 * 介面繼承介面為功能性拆分
 * 實作時,需將所有介面方法實作
 * @author dogocreat
 *
 */
public interface Activity extends Action{

	public void Run();

	public void Jump();

}
