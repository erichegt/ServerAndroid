//package br.com.caelum.models;
//
//import java.util.List;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.util.EntityUtils;
//
//import android.app.ProgressDialog;
//import android.content.Context;
//import android.util.Log;
//import android.widget.Toast;
//import br.com.caelum.cadastro.dao.AlunoDAO;
//import br.com.caelum.cadastro.modelo.Aluno;
//import br.com.caelum.cadastro.modelo.JSONHelper;
//
//public class SincronismoServer {
////	private String endereco = "http://10.0.2.2:8080/sincronizar";
//	private String endereco = "http://192.168.83.102:8080/sincronizar";
//	private final Context context;
//	private ProgressDialog progress;
//	private Toast aviso;
//	
//	
//	public SincronismoServer(Context context) {
//		this.context = context;
//	}
//	
//	public void sincronizar() {
//		progress = ProgressDialog.show(context, "Aguarde...", "Envio de dados para a web", true, true);
//		//ultimo true é pra deixar o user cancelar -> É IMPORTANTE Q TODA ACAO DE SEU USER SEJA CANCELAVEL
//		aviso = Toast.makeText(context, "Dados enviados com sucesso", Toast.LENGTH_LONG);
//		new Thread(new Runnable(){
//			@Override
//			public void run() {
//				try {
//					Thread.sleep(500);
//				
//					AlunoDAO dao = new AlunoDAO(context);
//					List<Aluno> lista = dao.getLista(false);
//					dao.close();
//					
//					HttpClient httpClient = new DefaultHttpClient();
//					
//					String listaEmJSON = new JSONHelper().toJSON(lista);
//					
//					Log.i("---REQUISICAO", listaEmJSON);
//					
////					String encode = endereco + URLEncoder.encode(listaEmJSON);
////					HttpGet httpGet = new HttpGet(encode);
//					HttpGet httpGet = new HttpGet(endereco);
//					HttpResponse response = httpClient.execute(httpGet);
//					
//					httpGet.setHeader("Accept", "application/json");
////					httpGet.setHeader("Content-type", "application/json");
//					
//					String jsonDeResposta = EntityUtils.toString(response.getEntity());
//					
//					Log.i("---REPOSTA:", jsonDeResposta);
//					
//					aviso.setText(jsonDeResposta);
//					
//					progress.dismiss(); //TODO ?
//					aviso.show();
//				} catch (Exception e) {	
//					Log.e("LASCOU","Oops" ,e);
//					e.printStackTrace();
//				}
//			}
//		}).start();
//	}
//}
