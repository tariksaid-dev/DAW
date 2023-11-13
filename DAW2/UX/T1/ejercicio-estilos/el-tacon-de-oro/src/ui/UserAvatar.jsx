function UserAvatar() {
  return (
    <div className="flex gap-5 items-center font-medium text-2xl text-slate-300 font-montserrat">
      <img
        className="block w-10 aspect-[1] object-cover object-center rounded-[50%] outline-2 outline outline-gray-300"
        src="/img/default-user.jpg"
      />
      <span>Username</span>
    </div>
  );
}

export default UserAvatar;
