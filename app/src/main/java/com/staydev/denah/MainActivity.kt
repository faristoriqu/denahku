package com.staydev.denah

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt
import androidx.core.view.isVisible
import com.staydev.denah.databinding.ActivityMainBinding
import com.staydev.denah.databinding.RelativeBinding


private lateinit var binding: RelativeBinding;
private lateinit var id:String;




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RelativeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.satu.setOnClickListener {
            id = "satu"
            show("No Kavling", id)
            Log.e("chek","satu")
        }
        binding.dua.setOnClickListener {
            id = "dua"
            show("No Kavling", id)
            Log.e("chek","dua")
        }
        binding.tiga.setOnClickListener {
            id = "tiga"
            show("No Kavling", id)
            Log.e("chek","tiga")
        }
        binding.empat.setOnClickListener {
            id = "empat"
            show("No Kavling", id)
            Log.e("chek","empat")
        }
        binding.lima.setOnClickListener {
            id = "lima"
            show("No Kavling", id)
            Log.e("chek","lima")
        }
        binding.enam.setOnClickListener {
            id = "enam"
            show("No Kavling", id)
            Log.e("chek","enam")
        }
        binding.tujuh.setOnClickListener {
            id = "tujuh"
            show("No Kavling", id)
            Log.e("chek","tujuh")
        }
        binding.delapan.setOnClickListener {
            id = "delapan"
            show("No Kavling", id)
            Log.e("chek","delapan")
        }
        binding.sembilan.setOnClickListener {
            id = "sembilan"
            show("No Kavling", id)
            Log.e("chek","sembilan")
        }
        binding.sepuluh.setOnClickListener {
            id = "sepuluh"
            show("No Kavling", id)
            Log.e("chek","sepuluh")
        }
        binding.sebelas.setOnClickListener {
            id = "sebelas"
            show("No Kavling", id)
            Log.e("chek","sebelas")
        }
        binding.duabelas.setOnClickListener {
            id = "duabelas"
            show("No Kavling", id)
            Log.e("chek","duabelas")
        }
        binding.tigabelas.setOnClickListener {
            id = "tigabelas"
            show("No Kavling", id)
            Log.e("chek","tigabelas")
        }
        binding.empatbelas.setOnClickListener {
            id = "empatbelas"
            show("No Kavling", id)
            Log.e("chek","empatbelas")
        }
        binding.limabelas.setOnClickListener {
            id = "limabelas"
            show("No Kavling", id)
            Log.e("chek","limabelas")
        }
        binding.enambelas.setOnClickListener {
            id = "enambelas"
            show("No Kavling", id)
            Log.e("chek","enambelas")
        }
        binding.tujuhbelas.setOnClickListener {
            id = "tujuhbelas"
            show("No Kavling", id)
            Log.e("chek","tujuhbelas")
        }
        binding.delapanbelas.setOnClickListener {
            id = "delapanbelas"
            show("No Kavling", id)
            Log.e("chek","delapanbelas")
        }
        binding.sembilanbelas.setOnClickListener {
            id = "sembilanbelas"
            show("No Kavling", id)
            Log.e("chek","sembilanbelas")
        }
        binding.duapuluh.setOnClickListener {
            id = "duapuluh"
            show("No Kavling", id)
            Log.e("chek","duapuluh")
        }
        binding.duapuluhsatu.setOnClickListener {
            id = "duapuluhsatu"
            show("No Kavling", id)
            Log.e("chek","duapuluhsatu")
        }
        binding.duapuluhdua.setOnClickListener {
            id = "duapuluhdua"
            show("No Kavling", id)
            Log.e("chek","duapuluhdua")
        }
        binding.duapuluhtiga.setOnClickListener {
            id = "duapuluhtiga"
            show("No Kavling", id)
            Log.e("chek","duapuluhtiga")
        }
        binding.duapuluhempat.setOnClickListener {
            id = "duapuluhempat"
            show("No Kavling", id)
            Log.e("chek","duapuluhempat")
        }
        binding.duapuluhlima.setOnClickListener {
            id = "duapuluhlima"
            show("No Kavling", id)
            Log.e("chek","duapuluhlima")
        }
        binding.duapuluhenam.setOnClickListener {
            id = "duapuluhenam"
            show("No Kavling", id)
            Log.e("chek","duapuluhenam")
        }
        binding.duapuluhtujuh.setOnClickListener {
            id = "duapuluhtujuh"
            show("No Kavling", id)
            Log.e("chek","duapuluhtujuh")
        }
        binding.duapuluhdelapan.setOnClickListener {
            id = "duapuluhdelapan"
            show("No Kavling", id)
            Log.e("chek","duapuluhdelapan")
        }
        binding.duapuluhsembilan.setOnClickListener {
            id = "duapuluhsembilan"
            show("No Kavling", id)
            Log.e("chek","duapuluhsembilan")
        }
        binding.tigapuluh.setOnClickListener {
            id = "tigapuluh"
            show("No Kavling", id)
            Log.e("chek","tigapuluh")
        }
        binding.tigapuluhsatu.setOnClickListener {
            id = "tigapuluhsatu"
            show("No Kavling", id)
            Log.e("chek","tigapuluhsatu")
        }
        binding.tigapuluhdua.setOnClickListener {
            id = "tigapuluhdua"
            show("No Kavling", id)
            Log.e("chek","tigapuluhdua")
        }
        binding.tigapuluhtiga.setOnClickListener {
            id = "tigapuluhtiga"
            show("No Kavling", id)
            Log.e("chek","tigapuluhtiga")
        }
        binding.tigapuluhempat.setOnClickListener {
            id = "tigapuluhempat"
            show("No Kavling", id)
            Log.e("chek","tigapuluhempat")
        }
        binding.lapangan.setOnClickListener {
            id = "lapangan"
            tampil("No Kavling", id)
            Log.e("chek","lapangan")
        }
        binding.jalan.setOnClickListener {
            id = "jalan"
            tampil("Ini ", id)
            Log.e("chek","jalan")
        }

    }

    private fun kondisi(id:String){
        if (id == "satu"){
            binding.satu.setImageResource(R.drawable.persegikuning)
        }else if(id == "dua"){
            binding.dua.setImageResource(R.drawable.persegikuning)
        }else if(id == "tiga"){
            binding.tiga.setImageResource(R.drawable.persegikuning)
        }else if(id == "empat"){
            binding.empat.setImageResource(R.drawable.persegikuning)
        }else if(id == "lima"){
            binding.lima.setImageResource(R.drawable.persegikuning)
        }else if(id == "enam"){
            binding.enam.setImageResource(R.drawable.persegikuning)
        }else if(id == "tujuh"){
            binding.tujuh.setImageResource(R.drawable.belokkuning)
        }else if(id == "delapan"){
            binding.delapan.setImageResource(R.drawable.ataskuning)
        }else if(id == "sembilan"){
            binding.sembilan.setImageResource(R.drawable.ataskuning)
        }else if(id == "sepuluh"){
            binding.sepuluh.setImageResource(R.drawable.persegikuning)
        }else if(id == "sebelas"){
            binding.sebelas.setImageResource(R.drawable.persegikuning)
        }else if(id == "duabelas"){
            binding.duabelas.setImageResource(R.drawable.persegikuning)
        }else if(id == "tigabelas"){
            binding.tigabelas.setImageResource(R.drawable.persegipanjangkuning)
        }else if(id == "empatbelas"){
            binding.empatbelas.setImageResource(R.drawable.jajargenjangkuning)
        }else if(id == "limabelas"){
            binding.limabelas.setImageResource(R.drawable.jajargenjangkuning)
        }else if(id == "enambelas"){
            binding.enambelas.setImageResource(R.drawable.jajargenjangkuning)
        }else if(id == "tujuhbelas"){
            binding.tujuhbelas.setImageResource(R.drawable.persegikuning)
        }else if(id == "delapanbelas"){
            binding.delapanbelas.setImageResource(R.drawable.persegikuning)
        }else if(id == "sembilanbelas"){
            binding.sembilanbelas.setImageResource(R.drawable.bawahkuning)
        }else if(id == "duapuluh"){
            binding.duapuluh.setImageResource(R.drawable.jajargenjangkuning)
        }else if(id == "duapuluhsatu"){
            binding.duapuluhsatu.setImageResource(R.drawable.jajargenjangkuning)
        }else if(id == "duapuluhdua"){
            binding.duapuluhdua.setImageResource(R.drawable.jajargenjangkuning)
        }else if(id == "duapuluhtiga"){
            binding.duapuluhtiga.setImageResource(R.drawable.cangkupankuning)
        }else if(id == "duapuluhempat"){
            binding.duapuluhempat.setImageResource(R.drawable.sebelahjalanbawahkuning)
        }else if(id == "duapuluhlima"){
            binding.duapuluhlima.setImageResource(R.drawable.jalantengahkuning)
        }else if(id == "duapuluhenam"){
            binding.duapuluhenam.setImageResource(R.drawable.persegikuning)
        }else if(id == "duapuluhtujuh"){
            binding.duapuluhtujuh.setImageResource(R.drawable.persegikuning)
        }else if(id == "duapuluhdelapan"){
            binding.duapuluhdelapan.setImageResource(R.drawable.persegikuning)
        }else if(id == "duapuluhsembilan"){
            binding.duapuluhsembilan.setImageResource(R.drawable.persegikuning)
        }else if(id == "tigapuluh"){
            binding.tigapuluh.setImageResource(R.drawable.persegikuning)
        }else if(id == "tigapuluhsatu"){
            binding.tigapuluhsatu.setImageResource(R.drawable.persegikuning)
        }else if(id == "tigapuluhdua"){
            binding.tigapuluhdua.setImageResource(R.drawable.persegikuning)
        }else if(id == "tigapuluhtiga"){
            binding.tigapuluhtiga.setImageResource(R.drawable.persegikuning)
        }else if(id == "tigapuluhempat"){
            binding.tigapuluhempat.setImageResource(R.drawable.persegikuning)
        }

    }
    private fun tampil(title: String, id:String) {
        val builder: AlertDialog.Builder? = binding.let {
            AlertDialog.Builder(this)
        }

        // 2. Chain together various setter methods to set the dialog characteristics
        builder
                ?.setMessage(id+" "+"tidak dijual")
                ?.setTitle(title)
                ?.setPositiveButton(R.string.OK, DialogInterface.OnClickListener{
                    dialog, which ->


                })

                ?.setNegativeButton(R.string.batal, DialogInterface.OnClickListener{
                    dialog, which -> null
                })
        builder?.create()?.show()
    }
    private fun show(title: String, id:String) {
        val builder: AlertDialog.Builder? = binding.let {
            AlertDialog.Builder(this)
        }

        // 2. Chain together various setter methods to set the dialog characteristics
        builder
                ?.setMessage(id)
                ?.setTitle(title)
                ?.setPositiveButton(R.string.beli, DialogInterface.OnClickListener{
                    dialog, which ->
                    Log.e("okelah","okeleh")
                    kondisi(id);

                })

                ?.setNegativeButton(R.string.batal, DialogInterface.OnClickListener{
                    dialog, which -> null
                })
        builder?.create()?.show()
    }
    private fun append(arr: Array<Int>, element: Int): Array<Int> {
        val list: MutableList<Int> = arr.toMutableList()
        list.add(element)
        return list.toTypedArray()
    }
}