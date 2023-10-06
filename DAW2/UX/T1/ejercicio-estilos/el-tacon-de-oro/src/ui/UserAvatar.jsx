function UserAvatar() {
  return (
    <div className="flex gap-5 items-center font-medium text-2xl ">
      <img
        className="block w-14 aspect-[1] object-cover object-center rounded-[50%] outline-2 outline outline-gray-100"
        src="/img/default-user.jpg"
      />
      <span>Username</span>
    </div>
  );
}

export default UserAvatar;
