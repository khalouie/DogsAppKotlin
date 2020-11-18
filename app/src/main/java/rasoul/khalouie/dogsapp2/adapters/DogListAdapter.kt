package rasoul.khalouie.dogsapp2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import rasoul.khalouie.dogsapp2.R
import rasoul.khalouie.dogsapp2.model.DogBreed

class DogListAdapter (val dogList : ArrayList<DogBreed>) : RecyclerView.Adapter<DogListAdapter.DogViewHolder>() {

    fun  updateDogList(newDogList : ArrayList<DogBreed>){
        dogList.clear()
        dogList.addAll(newDogList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.layout_item_dog,parent,false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dog = dogList[position]
        holder.txtName.text = dog.dogBreed
        holder.txtLifespan.text = dog.lifeSpan

    }

    override fun getItemCount() = dogList.size


    class DogViewHolder(var view : View) : RecyclerView.ViewHolder(view){
         val txtName : TextView = view.findViewById(R.id.txtDogName)
         val txtLifespan : TextView = view.findViewById(R.id.txtDogLifespan)
    }
}